package monopolyV0;

import java.util.ArrayList;
import java.util.List;

import monopolyV0.typecase.Case;

public class Controleur {
    private BaseMonopoly jeu;
    private List<Joueur> joueurs;
    private IHM ihm;

    public Controleur(BaseMonopoly nJeu, IHM nIhm) {
        ihm = nIhm;
        jeu = nJeu;
        joueurs = new ArrayList<Joueur>();
        int nombre = ihm.NbPlayer();
        while(nombre < 2){
            ihm.NotEnoughPlayer();
        }
        for (int i = 0; i < nombre; i++) {
            joueurs.add(ihm.NewPlayer(i));
        }
        jeu.initialiserPlateau();
    }

    public void jouer() {
        int nbRounds = 0;
        boolean finDePartie = false;

        while (!finDePartie) {
            nbRounds++;
            ihm.NewRound(nbRounds);
            for (Joueur j : joueurs) {
                ihm.DisplayPlayer(j);
                int nbToursPrison = j.getNbToursPrison();
                if (nbToursPrison > 0 && nbToursPrison < 3) {
                    ihm.InPrison(j);
                    j.resteEnPrison();
                } else {
                    if (nbToursPrison == 3) {
                        ihm.OutPrison(j);
                        j.sortDePrison();
                    }
                    int de1 = j.lancerDe();
                    int de2 = j.lancerDe();
                    int totalDe = de1 + de2;
                    ihm.ResultDice(j, totalDe, de1, de2);
                    if (j.getPosition() + totalDe > jeu.getNB_CASES())
                        // passage case depart
                        j.ajouterArgent(200);
                    int positionCourante = (j.getPosition() + totalDe) % jeu.getNB_CASES();
                    Case c = jeu.getPlateau()[positionCourante];
                    ihm.DisplayCase(j, positionCourante, c);
                    j.setPosition(positionCourante);
                    //Les conditions des dépendants des cases ont été raccourcis en appelant la méthode abstraite evenement
                    c.evenement(j);
                    if (j.getArgent() < 0) {
                        joueurs.remove(j);
                        break;
                    }

                }
            }
            if (joueurs.size() == 1) {
                ihm.EndGame(joueurs);
                finDePartie = true;
            }
        }
    }

}

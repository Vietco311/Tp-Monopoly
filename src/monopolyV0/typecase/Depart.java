package monopolyV0.typecase;

import monopolyV0.Joueur;

public class Depart extends Case {

    public Depart() {
        super("Depart");
    }

    public void evenement(Joueur j){
        j.ajouterArgent(200);
        ihm.StartCase(j);
    }
}


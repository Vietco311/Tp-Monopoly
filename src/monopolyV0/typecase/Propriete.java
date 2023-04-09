package monopolyV0.typecase;

import monopolyV0.Joueur;

public class Propriete extends Case {
    private Joueur proprietaire;
    private int prix;
    private int loyer;

    public Propriete(String nom, int prix, int loyer) {
        super(nom);
        this.prix = prix;
        this.loyer = loyer;
        this.proprietaire = null;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }

    public int getPrix() {
        return prix;
    }

    public int getLoyer() {
        return loyer;
    }

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }

    public boolean estAchetable() {
        return proprietaire == null;
    }

    @Override
    public void evenement(Joueur j){
        if (getProprietaire() == null) {
            String reponse = ihm.AskBuyProperty(j, this);
            if (reponse.equals("o")) {
                setProprietaire(j);
                j.retirerArgent(prix);
                ihm.HasBuy(j, this);
            }
        } else if (proprietaire != j) {
            j.retirerArgent(loyer);
            proprietaire.ajouterArgent(loyer);
            ihm.PayLoyer(j,this);
        }
    }
}

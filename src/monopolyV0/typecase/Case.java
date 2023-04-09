package monopolyV0.typecase;

import monopolyV0.IHM;
import monopolyV0.Joueur;

public abstract class Case {
    private String nom;
    protected IHM ihm;

    public Case(String nom) {
        this.nom = nom;
        this.ihm = new IHM();
    }
    public String getNom() {
        return nom;
    }
    public String toString() {
    	return nom;
    }

    //Création de la méthode abstraite evenement afin de pouvoir
    //gérer d'une traite les évènements des cases lors du jeu.
    public abstract void evenement(Joueur j);

}


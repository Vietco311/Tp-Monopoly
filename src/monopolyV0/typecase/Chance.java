package monopolyV0.typecase;

import monopolyV0.Joueur;

public class Chance extends Case {
    private int montant;
    private static final int MONTANT_MAX=100;
    public Chance() {
        super("Chance");
        montant=(int) (Math.random() * MONTANT_MAX -  Math.random() * MONTANT_MAX) +1;
    }

    public int getMontant() {
        return montant;
    }

    @Override
    public void evenement(Joueur j){
        ihm.Luck();
        if (montant > 0) {
            j.ajouterArgent(montant);
            ihm.Lucky(j, montant);
        } else {
            j.retirerArgent(-montant);
            ihm.Unlucky(j, montant);
        }
    }
}

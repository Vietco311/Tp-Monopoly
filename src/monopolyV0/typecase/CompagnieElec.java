package monopolyV0.typecase;

import monopolyV0.Joueur;

//Uniquement créer afin de faire marcher le projet dû à la classe Case qui est devenu une classe abstraite

public class CompagnieElec extends Case{

    public CompagnieElec() {
        super("Compagnie Electrique");
    }

    @Override
    public void evenement(Joueur j) {
    }

}

package monopolyV0.typecase;

import monopolyV0.Joueur;

//Uniquement créer afin de faire marcher le projet dû à la classe Case qui est devenu une classe abstraite

public class TaxeLuxe extends Case {

    public TaxeLuxe() {
        super("Taxe de luxe");
    }

    @Override
    public void evenement(Joueur j) {
    }

}

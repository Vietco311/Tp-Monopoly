package monopolyV0.typecase;

import monopolyV0.Joueur;

//Uniquement créer afin de faire marcher le projet dû à la classe Case qui est devenu une classe abstraite

public class ParcGratuit extends Case {

    public ParcGratuit() {
        super("Parc gratuit");
    }

    @Override
    public void evenement(Joueur j) {
        
    }
    

}

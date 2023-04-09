package monopolyV0;

import monopolyV0.typecase.Case;

public interface BaseMonopoly {


    public void initialiserPlateau();

    public int getNB_CASES();
    
    public Case[] getPlateau();
}

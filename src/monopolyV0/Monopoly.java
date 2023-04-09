package monopolyV0;

import monopolyV0.typecase.AllerPrison;
import monopolyV0.typecase.CaisseCommunaute;
import monopolyV0.typecase.Case;
import monopolyV0.typecase.Chance;
import monopolyV0.typecase.CompagnieEaux;
import monopolyV0.typecase.CompagnieElec;
import monopolyV0.typecase.Depart;
import monopolyV0.typecase.Impot;
import monopolyV0.typecase.ParcGratuit;
import monopolyV0.typecase.Prison;
import monopolyV0.typecase.Propriete;
import monopolyV0.typecase.TaxeLuxe;

public class Monopoly implements BaseMonopoly{
    private Case[] plateau;
    private final int NB_CASES=40;

    public Monopoly(){
		plateau = new Case[NB_CASES];
	}

	public int getNB_CASES() {
		return NB_CASES;
	}

	public Case[] getPlateau() {
		return plateau;
	}

    public void initialiserPlateau() {
		plateau[0]=new Depart();
		plateau[1]=new Propriete("Belleville",60,2);
		plateau[2]=new CaisseCommunaute();
		plateau[3]=new Propriete("Rue Lecourbe",60,4);
		plateau[4]=new Impot();
		plateau[5]=new Propriete("Gare Montparnasse",200,25);
		plateau[6]=new Propriete("Rue de Vaugirard",100,6);
		plateau[7]=new Chance();
		plateau[8]=new Propriete("Rue de Courcelles",100,6);
		plateau[9]=new Propriete("Avenue de la république",120,8);
		plateau[10]=new Prison();
		plateau[11]=new Propriete("Boulevard de La Vilette",140,10);
		plateau[12]=new CompagnieElec();
		plateau[13]=new Propriete("Avenue de Neuilly",140,10);
		plateau[14]=new Propriete("Rue de Paradis",160,12);
		plateau[15]=new Propriete("Gare de Lyon",200,25);
		plateau[16]=new Propriete("Avenue Mozart",180,14);
		plateau[17]=new CaisseCommunaute();
		plateau[18]=new Propriete("Boulevard Saint-Michel Rue Saint-Honoré",180,14);
		plateau[19]=new Propriete("Place Pigalle",200,16);
		plateau[20]=new ParcGratuit();
		plateau[21]=new Propriete("Avenue Matignon",220,18);
		plateau[22]=new Chance();
		plateau[23]=new Propriete("Boulevard Malesherbes",220,18);
		plateau[24]=new Propriete("Avenue Henri-Martin",220,20);
		plateau[25]=new Propriete("Gare du Nord",200,25);
		plateau[26]=new Propriete("Faubourg Saint Honoré",240,22);
		plateau[27]=new Propriete("Place de la Bourse",260,22);
		plateau[28]=new CompagnieEaux();
		plateau[29]=new Propriete("Rue la Fayette",260,22); 
		plateau[30]=new AllerPrison();
		plateau[31]=new Propriete("Avenue de Breteuil",280,24);
		plateau[32]=new Propriete("Avenue Foch",300,24);
		plateau[33]=new CaisseCommunaute();
		plateau[34]=new Propriete("Boulevard des capucines",300,26);
		plateau[35]=new Propriete("Gare Saint Lazare",200,25);
		plateau[36]=new Chance();
		plateau[37]=new Propriete("Avenue des Champs-Élysées",320,28);
		plateau[38]=new TaxeLuxe();
		plateau[39]=new Propriete("Rue de la paix",400,50);
    }

    
    
      
}

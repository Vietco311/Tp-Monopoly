package monopolyV0;

public class TestJeu {

	public TestJeu() {
	}

	public static void main(String[] args) {
		BaseMonopoly jeu=new Monopoly();
		IHM ihm = new IHM();
		Controleur crtl = new Controleur(jeu, ihm);
		crtl.jouer();
	}

}

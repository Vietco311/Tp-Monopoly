package monopolyV0;

import java.util.List;
import java.util.Scanner;

import monopolyV0.typecase.Case;
import monopolyV0.typecase.Propriete;

//Il serait aussi possible que IHM soit une interface, pouvant alors être traduit dans plusieurs langues
public class IHM {

    //Classe servant uniquement à l'affichage en console et aux entrées utilisateurs
    private Scanner scanner = new Scanner(System.in);

    public int NbPlayer(){
        System.out.println("Nombre de joueur?");
        int nombre = scanner.nextInt();
        return nombre;
    }

    public Joueur NewPlayer(int i){
        System.out.print("Nom du joueur " + (i + 1) + " : ");
        String nom= scanner.next();
        Joueur joueur = new Joueur(nom);
        return joueur;
    }

    public void NotEnoughPlayer(){
        System.out.println("Pas assez de joueur");
    }

    public void NewRound(int nb){
        System.out.println("***********************************");
        System.out.println("Round N°" + nb + " :");
    }

    public void DisplayPlayer(Joueur j){
        System.out.println("- C'est au tour de " + j);
    }

    public void InPrison(Joueur j){
        System.out.println("Il ne joue pas il est en prison!");
    }

    public void OutPrison(Joueur j){
        System.out.println("Il sort de prison!");
    }

    public void ResultDice(Joueur j, int totalDe, int de1, int de2){
        System.out.println(j.getNom() + " lance les dés et fait " + de1 + " + " + de2 + " = " + totalDe);
    }

    public void DisplayCase(Joueur j, int positionCourante, Case c){
        System.out.println(j.getNom() + " tombe sur la case N° " + positionCourante + " : "+ c.getNom());
    }

    public String AskBuyProperty(Joueur j, Propriete p){
        System.out.print(j.getNom()+" veut-il acheter la " + p.getNom() + " ("+p.getPrix()+" euros) (o-n)? ");
        String reponse = scanner.nextLine().toLowerCase();
        return reponse;
    }

    public void HasBuy(Joueur j, Propriete p){
        System.out.println(j + " a acheté " + p.getNom());
    }

    public void PayLoyer(Joueur j, Propriete p){
        System.out.println(j.getNom() + " a payé " + p.getLoyer() + " à " + p.getProprietaire().getNom());

    }

    public void Luck(){
        System.out.print("Tirage d'une carte chance : " );
    }

    public void Lucky(Joueur j, int montant){
        System.out.println(j.getNom() + " reçoit " + montant + " euros");
    }

    public void Unlucky(Joueur j, int montant){
        System.out.println(j.getNom() + " doit payer " + (-montant) + " euros");
    }

    public void GoPrison(Joueur j){
        System.out.println(j.getNom() + " va en prison !");
    }

    public void StartCase(Joueur j){
        System.out.println(j.getNom() + " passe par la case départ et reçoit 200 euros");
    }

    public void NoMoney(Joueur j){
        System.out.println(j + " n'a plus d'argent et quitte le jeu !");
    }
    public void EndGame(List<Joueur> joueurs){
        System.out.println("***********************************");
        System.out.println("Fin de la partie ! Le gagnant est " + joueurs.get(0));
    }
}

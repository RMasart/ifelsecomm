package exercice;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        int quota = 10;
         Scanner clavier = new Scanner(System.in);
         System.out.println("Saisir le nombre de vente");
         int vente = clavier.nextInt();
        if (vente >= quota) {
            System.out.println("Félicitation ! Vous avez rempli le quota");
        }
        else {
            int resultat = quota - vente;
            System.out.println("Ils vous en manquent" + " " + resultat +" " + "afin de remplir le quota");
        }
         clavier.close();
    }   
}

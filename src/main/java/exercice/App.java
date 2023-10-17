package exercice;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);
         System.out.println("Saisir le nombre de vente");
         int vente = clavier.nextInt();
        if (vente >= 10) {
            System.out.println("Félicitation ! Vous avez rempli le quota");
        }
        else {
            int resultat = 10 - vente;
            System.out.println("Ils vous restent" + " " + resultat +" " + "afin de remplir le quota");
        }
         clavier.close();
    }   
}

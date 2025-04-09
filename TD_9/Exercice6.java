import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = sc.nextLine().toLowerCase();
        
        char[] voyelles = {'a', 'c', 'i', 'o', 'u', 'y'};
        int[] compteur = new int[voyelles.length];

        for (char lettre : mot.toCharArray()) {
            for (int i = 0; i < voyelles.length; i++) {
                if (lettre == voyelles[i]) {
                    compteur[i]++;
                }
            }
        }

        for (int i = 0; i < voyelles.length; i++) {
            System.out.println(compteur[i] + " fois la lettre " + voyelles[i]);
        }
        
        sc.close();
    }
}
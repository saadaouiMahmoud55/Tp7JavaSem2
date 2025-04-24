import java.util.Scanner;

public class tp2_1 {
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n <= 10) {
                System.out.println("Erreur : L'entier doit être strictement positif.");
            }
            
        } while (n <= 10);
        return n;
    }

    public static void RemplirTAb(double[] tab) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            double note;
            do {
                System.out.print("Entrez la note de l'étudiant " + (i + 1) + " (entre 0 et 20) : ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Erreur : Veuillez entrer un nombre réel valide.");
                    scanner.next();
                }
                note = scanner.nextDouble();
                if (note < 0 || note > 20) {
                    System.out.println("Erreur : La note doit être entre 0 et 20.");
                }
            } while (note < 0 || note > 20);
            tab[i] = note;
        }
    }

    public static float Calcul_Moy(double[] tab) {
        double s = 0;
        for (double note : tab) {
            s += note;
        }
        return (float) (s / tab.length);
    }

    public static int NombreNote(double[] tab, float moyenne) {
        int compteur = 0;
        for (double note : tab) {
            if (note > moyenne) {
                compteur++;
            }
        }
        return compteur;
    }

    public static void main(String[] args) {
        int n = lectureN();
        double[] T = new double[n];
        RemplirTAb(T);
        float moyenne = Calcul_Moy(T);
        int nbSup = NombreNote(T, moyenne);

        System.out.printf("La moyenne de la classe est : %.2f%n", moyenne);
        System.out.println("Le nombre de notes supérieures à la moyenne est : " + nbSup);
    }
}

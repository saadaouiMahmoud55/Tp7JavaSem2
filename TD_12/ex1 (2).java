import java.util.Scanner;

public class ex1 {

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

            if (n <= 0) {
                System.out.println("Erreur : L'entier doit être strictement positif.");
            }
        } while (n <= 0);

        return n;
    }

    public static double somme(double[] t) {
        double s = 0;
        for (int i = 0; i < t.length; i++) {
            s = s + t[i];
        }
        return s;
    }

    public static void incre(double[] t, double valeur) {
        for (int i = 0; i < t.length; i++) {
            t[i] = t[i] + valeur;
        }
    }

    public static void afficher(double[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int taille = lectureN();
        double[] tab = new double[taille];

        System.out.println("Saisir les valeurs du tableau :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextDouble();
        }

        System.out.println("Tableau initial :");
        afficher(tab);

        double s = somme(tab);
        System.out.println("Somme des éléments = " + s);

        System.out.print("Donner une valeur à ajouter à chaque élément : ");
        double v = sc.nextDouble();

        incre(tab, v);

        System.out.println("Tableau après incrémentation :");
        afficher(tab);
    }
}
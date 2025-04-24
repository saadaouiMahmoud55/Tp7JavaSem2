import java.util.Scanner;

public class ex2 {

    public static int lectureTaille() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez une taille strictement positive : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : veuillez entrer un entier valide.");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : la taille doit être strictement positive.");
            }
        } while (n <= 0);

        return n;
    }

    public static void saisir(int[] tab, String nom) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisie du tableau " + nom + " :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(nom + "[" + i + "] = ");
            tab[i] = sc.nextInt();
        }
    }

    public static void afficher(int[] tab, String nom) {
        System.out.print(nom + " : ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static int[] additionner(int[] a, int[] b) {
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] + b[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int taille = lectureTaille();

        int[] tab1 = new int[taille];
        int[] tab2 = new int[taille];

        saisir(tab1, "A");
        saisir(tab2, "B");

        int[] tabSomme = additionner(tab1, tab2);

        System.out.println("\n--- Résultat ---");
        afficher(tab1, "Tableau A");
        afficher(tab2, "Tableau B");
        afficher(tabSomme, "Somme A + B");
    }
}

import java.util.Scanner;

public class app3 {

    static Scanner sc = new Scanner(System.in);

    public static int LectureN() {
        int nb = -1;
        while (nb <= 0) {
            System.out.print("Donner un entier positif : ");
            try {
                nb = Integer.parseInt(sc.next());
            } catch (Exception e) {
                System.out.println("Ce n'est pas un entier valide.");
                nb = -1;
            }
        }
        return nb;
    }

    public static void RemplirTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Donner un entier N°" + (i + 1) + " : ");
                try {
                    tab[i] = Integer.parseInt(sc.next());
                    valid = true;
                } catch (Exception e) {
                    System.out.println("Ce n'est pas un entier valide.");
                }
            }
        }
    }

    public static int CreerTpair(int[] tab, int[] tabP) {
        int j = 0;
        for (int value : tab) {
            if (value % 2 == 0) {
                tabP[j++] = value;
            }
        }
        return j; // nombre d'éléments pairs
    }

    public static int CreerTimpair(int[] tab, int[] tabI) {
        int j = 0;
        for (int value : tab) {
            if (value % 2 != 0) {
                tabI[j++] = value;
            }
        }
        return j; // nombre d'éléments impairs
    }

    public static void Afficher(int[] tab, int nb) {
        for (int i = 0; i < nb; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args) {
        int n = LectureN();
        int[] tab = new int[n];
        RemplirTab(tab);

        int[] tabP = new int[n];
        int nbP = CreerTpair(tab, tabP);

        int[] tabI = new int[n];
        int nbI = CreerTimpair(tab, tabI);

        System.out.println("Tableau original : ");
        Afficher(tab, n);

        System.out.println("Tableau pair : ");
        Afficher(tabP, nbP);

        System.out.println("Tableau impair : ");
        Afficher(tabI, nbI);
    }
}

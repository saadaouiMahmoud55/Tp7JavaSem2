import java.util.Scanner;

public class tp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = lectureN(sc);
        int n2 = lectureN(sc);
        double[][] M = new double[n1][n2];
        RemplirTAb(sc, M, n1, n2);

        for (int i = 0; i < n1; i++) {
            double somme = CalculSomme(M, n2, i);
            System.out.println("Somme de la ligne " + i + " : " + somme);
        }
    }

    static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.print("Entrer un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    static void RemplirTAb(Scanner sc, double[][] tab, int lignes, int colonnes) {
        System.out.println("Entrer les éléments de la matrice :");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                tab[i][j] = sc.nextDouble();
            }
        }
    }

    static double CalculSomme(double[][] tab, int tailleLigne, int i) {
        double somme = 0;
        for (int j = 0; j < tailleLigne; j++) {
            somme += tab[i][j];
        }
        return somme;
    }
}

import java.util.Scanner;

public class tp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        int sum = 0;
        double product = 1;
        double average;

        System.out.println("Entrez le nombre de lignes (n1) :");
        n1 = sc.nextInt();
        while (n1 <= 0 || n1 >= 30) {
            System.out.println("Le nombre de lignes doit être un entier strictement positif inférieur à 30.");
            n1 = sc.nextInt();
        }

        System.out.println("Entrez le nombre de colonnes (n2) :");
        n2 = sc.nextInt();
        while (n2 <= 0 || n2 >= 30) {
            System.out.println("Le nombre de colonnes doit être un entier strictement positif inférieur à 30.");
            n2 = sc.nextInt();
        }

        int[][] M = new int[n1][n2];
        System.out.println("Remplir la matrice (entrez les éléments un par un) :");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextInt();
                sum += M[i][j];
                product *= M[i][j];
            }
        }

        int totalElements = n1 * n2;
        average = sum / (double) totalElements;

        System.out.println("La somme des éléments de la matrice est : " + sum);
        System.out.println("Le produit des éléments de la matrice est : " + product);
        System.out.println("La moyenne des éléments de la matrice est : " + average);
    }
}

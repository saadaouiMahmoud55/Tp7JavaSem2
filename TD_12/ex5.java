import java.util.Scanner;

public class ex5 {
    public static void affich(double[][] t, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double[][] t) {
        if (t.length == 0) return true;
        int taille = t[0].length;
        for (double[] row : t) {
            if (row.length != taille) {
                return false;
            }
        }
        return true;
    }

    public static double[] somme(double[][] t, int n) {
        double[] res = new double[t.length];
        for (int i = 0; i < n; i++) {
            double somme = 0;
            for (int j = 0; j < t[i].length; j++) {
                somme += t[i][j];
            }
            res[i] = somme;
        }
        return res;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2)) return null;
        if (t1.length != t2.length || t1[0].length != t2[0].length) return null;

        double[][] result = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[0].length; j++) {
                result[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter nb lignes mat 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter nb col mat 1: ");
        int cols1 = scanner.nextInt();

        double[][] tab1 = new double[rows1][cols1];
        System.out.println("Enter elements mat 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                tab1[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Enter nb lignes mat  2: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter nb lignes mat 2: ");
        int cols2 = scanner.nextInt();

        double[][] tab2 = new double[rows2][cols2];
        System.out.println("Enter elements  mat 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                tab2[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nmat1:");
        affich(tab1, rows1);
        System.out.println("Matrice est reguliée: " + regulier(tab1));

        System.out.println("\ncol som for mat1:");
        double[] sommes = somme(tab1, rows1);
        for (double d : sommes) {
            System.out.println(d);
        }

        System.out.println("\nsom matrices:");
        double[][] sommeTotale = somme(tab1, tab2);
        if (sommeTotale != null) {
            affich(sommeTotale, rows1);
        } else {
            System.out.println("Matrices sont compatible à addition.");
        }

    }
}
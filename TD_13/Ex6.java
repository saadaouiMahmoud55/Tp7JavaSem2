import java.util.Scanner;

public class Ex6 {
    static int sommeTableau(int[] T, int i) {
        if (i == T.length) return 0;
        return T[i] + sommeTableau(T, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Taille du tableau : ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("T[" + i + "] = ");
            T[i] = sc.nextInt();
        }

        System.out.println("Somme = " + sommeTableau(T, 0));
    }
}

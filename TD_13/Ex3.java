import java.util.Scanner;

public class Ex3 {
    static boolean estPremier(int n, int d) {
        if (d == 1) return true;
        if (n % d == 0) return false;
        return estPremier(n, d - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier > 1 : ");
            n = sc.nextInt();
        } while (n <= 1);

        System.out.println("Nombres premiers < " + n + " : ");
        for (int i = 2; i < n; i++) {
            if (estPremier(i, i - 1)) {
                System.out.print(i + " ");
            }
        }
    }
}

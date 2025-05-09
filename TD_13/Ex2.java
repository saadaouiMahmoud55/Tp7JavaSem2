import java.util.Scanner;

public class Ex2 {
    static int factorielle(int n) {
        if (n == 1) return 1;
        return n * factorielle(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier > 0 : ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("Factorielle = " + factorielle(n));
    }
}

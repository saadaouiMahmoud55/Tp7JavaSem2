import java.util.Scanner;

public class Ex1 {
    static int somme(int n) {
        if (n == 1) return 1;
        return n + somme(n - 1); // Appel récursif
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier > 0 : ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("Somme = " + somme(n));
    }
}

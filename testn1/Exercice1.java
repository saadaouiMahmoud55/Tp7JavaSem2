import java.util.Scanner;

public class Exercice1 {

    public static int Lecture() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        while (true) {
            System.out.print("Entrez un entier strictement positif : ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Erreur : Il faut donner un entier strictement positif.");
                }
            } else {
                System.out.println("Erreur : Il faut entrer un entier valide.");
                scanner.next();
            }
        }

        return n;
    }

    public static int Compter(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = Lecture();
        int chiffres = Compter(n);
        System.out.println("Le nombre de chiffres : " + chiffres);
    }
}
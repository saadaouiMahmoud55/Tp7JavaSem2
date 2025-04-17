import java.util.Scanner;

public class Exercice2 {
    public static double addition(double a, double b) {
        return a + b;
    }

    public static double soustraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro !");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez une opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        System.out.print("Entrez le premier nombre : ");
        double a = scanner.nextDouble();
        System.out.print("Entrez le deuxième nombre : ");
        double b = scanner.nextDouble();

        double resultat = 0;

        switch (operation) {
            case '+': resultat = addition(a, b); break;
            case '-': resultat = soustraction(a, b); break;
            case '*': resultat = multiplication(a, b); break;
            case '/': resultat = division(a, b); break;
            default:
                System.out.println("Opération invalide.");
                return;
        }

        System.out.println("Résultat : " + resultat);
    }
    
}

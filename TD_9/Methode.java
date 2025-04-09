import java.util.Scanner;

public class Methode {
    
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez un entier strictement positif : ");
            while (!scanner.hasNextInt()) { 
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next();
            }
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Erreur : L'entier doit être strictement positif.");
            }
        } while (n <= 0);

        return n;
    }

    
    public static boolean EstPair(int n) {
        return n % 2 == 0;
    }
    public static int Compter(int n) {
        int co = 1; 
        while (n / 10 != 0) { 
            n = n / 10; 
            co++; 
        }
        return co;
    }
    public static int calculeSomme(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i * i; 
        }
        return somme;
    }
    
    public static void main(String[] args) {
        int[] entiers = new int[10]; 

        System.out.println("Veuillez entrer 10 entiers strictement positifs :");
        for (int i = 0; i < 10; i++) {
            entiers[i] = lectureN();
        }
        System.out.println("\nLes entiers pairs sont : ");
        for (int n : entiers) {
            if (EstPair(n)) {
                System.out.print(n + " ");
            }

        }
        
    

    }
}
import java.util.Scanner;

public class tp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un texte : ");
        String texte = scanner.nextLine();
        System.out.print("Donner mot 1 : ");
        String mot1 = scanner.nextLine();
        System.out.print("Donner mot 2 : ");
        String mot2 = scanner.nextLine();
        if (!texte.contains(mot1)) {
            System.out.println("Mot 1 n'existe pas dans le texte.");
        } else {
            texte = texte.replace(mot1, mot2);
            System.out.println("Le nouveau texte est : " + texte);
        }
        scanner.close();
    }
}

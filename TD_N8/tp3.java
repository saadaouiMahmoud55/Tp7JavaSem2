import java.util.Scanner;

public class tp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un texte : ");
        StringBuffer texte = new StringBuffer(scanner.nextLine());
        System.out.print("Donner mot 1 : ");
        String mot1 = scanner.nextLine();
        System.out.print("Donner mot 2 : ");
        String mot2 = scanner.nextLine();
        int x = texte.indexOf(mot1);
        if (x == -1) {
            System.out.println("Mot 1 n'existe pas dans le texte.");
        } else {
            while (x != -1) {
                texte.replace(x, x + mot1.length(), mot2);
                x = texte.indexOf(mot1, x + mot2.length());
            }
            System.out.println("Le nouveau texte est : " + texte);
        }
        scanner.close();
    }
}
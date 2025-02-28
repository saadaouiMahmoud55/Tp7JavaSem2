import java.util.Scanner;

public class tp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" donne un Texte : ");
        String texte = sc.nextLine();

        System.out.print("donne mot1 : ");
        String mot1 = sc.nextLine();

        System.out.print("donne mot 2: ");
        String mot2 = sc.nextLine();

        if (!texte.contains(mot2)) {
            System.out.println("Le mot \"" + mot2 + "\" n'existe pas dans le texte.");
        } else {
            System.out.println("Texte modifié : " + texte.replace(mot1, mot2));
        }

        sc.close();
    }
}

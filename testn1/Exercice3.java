import java.util.Scanner;

public class Exercice3{

    public static boolean estInfinitif(String verbe) {
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
    }

    public static String determinerGroupe(String verbe) {
        verbe = verbe.toLowerCase();
        if (verbe.equals("aller")) {
            return "3e groupe";
        }
        if (verbe.endsWith("er")) {
            return "1er groupe";
        }

        String[] deuxiemeGroupe = {"finir", "choisir", "réussir", "grandir", "grossir", "maigrir", "rougir"};
        for (String v : deuxiemeGroupe) {
            if (verbe.equals(v)) {
                return "2e groupe";
            }
        }
        return "3e groupe";
    }

    public static String lireVerbeInfinitif() {
        Scanner scanner = new Scanner(System.in);
        String verbe;
        do {
            System.out.print("Entrez un verbe à l'infinitif : ");
            verbe = scanner.nextLine().trim().toLowerCase();
        } while (!estInfinitif(verbe));
        return verbe;
    }

    public static void main(String[] args) {
        String verbe = lireVerbeInfinitif();
        String groupe = determinerGroupe(verbe);
        System.out.println("Le verbe \"" + verbe + "\" appartient au " + groupe + ".");
    }
}

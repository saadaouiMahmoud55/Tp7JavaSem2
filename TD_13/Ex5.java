import java.util.Scanner;

public class Ex5 {
    static int compter(String ch, char c, int i) {
        if (i == ch.length()) return 0;
        int count = (ch.charAt(i) == c) ? 1 : 0;
        return count + compter(ch, c, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Donner une chaîne (≤ 50 caractères) : ");
            ch = sc.nextLine();
        } while (ch.length() > 50);

        System.out.print("Donner un caractère : ");
        char c = sc.next().charAt(0);

        int occ = compter(ch, c, 0);
        System.out.println("Le caractère '" + c + "' apparaît " + occ + " fois.");
    }
}

import java.util.Scanner;

public class Ex4 {
    static boolean estPalindrome(String ch, int debut, int fin) {
        if (debut >= fin) return true;
        if (ch.charAt(debut) != ch.charAt(fin)) return false;
        return estPalindrome(ch, debut + 1, fin - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Donner une chaîne (≤ 30 caractères) : ");
            ch = sc.nextLine();
        } while (ch.length() > 30);

        if (estPalindrome(ch, 0, ch.length() - 1)) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }
    }
}

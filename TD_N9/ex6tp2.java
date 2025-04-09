import java.util.Scanner;

public class ex6tp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un mot : ");
        String mot = sc.nextLine().toLowerCase();

        int a = 0, e = 0, i = 0, o = 0, u = 0, y = 0;

        for (char lettre : mot.toCharArray()) {
            if (lettre == 'a') {
                a++;
            } else if (lettre == 'e') {
                e++;
            } else if (lettre == 'i') {
                i++;
            } else if (lettre == 'o') {
                o++;
            } else if (lettre == 'u') {
                u++;
            } else if (lettre == 'y') {
                y++;
            }
        }

        System.out.println(a + " fois la lettre a");
        System.out.println(e + " fois la lettre e");
        System.out.println(i + " fois la lettre i");
        System.out.println(o + " fois la lettre o");
        System.out.println(u + " fois la lettre u");
        System.out.println(y + " fois la lettre y");

        sc.close();
    }
}

import java.util.Scanner;

public class tp1{
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            while (!scanner.hasNextInt())
            {
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next();
            }
            n=scanner.nextInt();
            if (n<=0) {
                System.out.println("Erreur : L'entier doit être strictement positif.");
            }
        } while (n<=0);
        return n;
    }
    public static void RemplirTAb(int[] tab) {
        Scanner scanner = new Scanner(System.in);
        int i;
        for (i=0;i<tab.length;i++) {
            System.out.print("Entrez entier a la position " + i + " : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : Veuillez entrer un entier valide.");
                scanner.next();
            }
            tab[i]=scanner.nextInt();
        }
    }

    public static void Remplacer(int[] tab, int x1, int x2) {
        int i;
        for (i=0;i<tab.length;i++) {
            if (tab[i]==x1) {
                tab[i]=x2;
            }
        }
    }

    public static void AfficheTAb(int[] tab) {
        for (int i : tab) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n,x1,x2;
        n=lectureN();
        int[] tableau = new int[n];
        RemplirTAb(tableau);
        System.out.print("Entrez l'entier X1 à remplacer : ");
        Scanner scanner = new Scanner(System.in);
        x1=scanner.nextInt();
        System.out.print("Entrez l'entier X2 pour remplacer X1 : ");
        x2=scanner.nextInt();
        Remplacer(tableau, x1, x2);
        AfficheTAb(tableau);
    }
}

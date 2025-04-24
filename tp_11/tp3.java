import java.util.Scanner;
public class tp3 {

    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner la taille du tableau (n > 0) : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int[] RemplirTAb(int n) {
        Scanner sc = new Scanner(System.in);
        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("T[" + i + "] = ");
                T[i] = sc.nextInt();
            } while (T[i] <= 0);
        }
        return T;
    }

    public static int[] CréerTpair(int[] T) {
        int count = 0;
        for (int val : T) {
            if (val % 2 == 0) count++;
        }
        int[] T_pair = new int[count];
        int j = 0;
        for (int val : T) {
            if (val % 2 == 0) {
                T_pair[j++] = val;
            }
        }
        return T_pair;
    }

    public static int[] CréerTimpair(int[] T) {
        int count = 0;
        for (int val : T) {
            if (val % 2 != 0) count++;
        }
        int[] T_impair = new int[count];
        int j = 0;
        for (int val : T) {
            if (val % 2 != 0) {
                T_impair[j++] = val;
            }
        }
        return T_impair;
    }

    public static void AfficheTAb(int[] T) {
        for (int val : T) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = lectureN();
        int[] T = RemplirTAb(n);
        int[] T_pair = CréerTpair(T);
        int[] T_impair = CréerTimpair(T);
        System.out.print("Tableau des pairs : ");
        AfficheTAb(T_pair);
        System.out.print("Tableau des impairs : ");
        AfficheTAb(T_impair);
    }
}
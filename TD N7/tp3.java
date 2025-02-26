import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nl, nc, i, j, min, max;
        int[][] M;
        int[] T;

        do{
            System.out.print("Donner les lignes de matrice M : ");
            nl = sc.nextInt();
        }while(nl < 1 || nl > 20);

        do{
            System.out.print("Donner les colonnes de matrice M : ");
            nc = sc.nextInt();
        }while(nc < 1 || nc > 30);

        M = new int[nl][nc];
        T = new int[nl];

        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++){
                System.out.print("M[" + i + "]" + "[" + j + "] = ");
                M[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < nl; i++) {
            T[i] = 0;
            for (j = 0; j < nc; j++){
                T[i]+= M[i][j];
            }
        }

        System.out.println("La matrice est :");

        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++){
                if (i == 0 && j == 0) {
                    System.out.print("[" + M[i][j] + ",");
                }else if(i == nl - 1 && j == nc - 1){
                    System.out.println(M[i][j] + "]");
                }else if(i < nl && j == nc - 1){
                    System.out.println(M[i][j] + "]");
                }else if(j == 0){
                    System.out.print("[" + M[i][j] + ",");
                }else{
                    System.out.print(M[i][j] + ",");
                }
            }
        }

        System.out.print("La somme de chaque ligne est : ");

        for (i = 0; i < nl; i++) {
            if (i == 0) {
                System.out.print("[" + T[i] + ",");
            }else if (i == nl - 1){
                System.out.println(T[i] + "]");
            }else{
                System.out.print(T[i] + ",");
            }
        }

        min = T[0];
        max = T[0];

        for (i = 1; i < nl; i++){
            if (min > T[i]) {
                min = T[i];
            }
            if (max < T[i]) {
                max = T[i];
            }
        }

        System.out.println("Le minimum des somme est : " + min);
        System.out.println("Le maximum des somme est : " + max);

    }
}
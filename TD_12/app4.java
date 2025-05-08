import java.util.Scanner;
public class app4{

    public static int LectureN(){
        Scanner sc = new Scanner(System.in);
        int nb;
        String ch;

        do {
            System.out.print("Donner un entier positif : ");
            ch = sc.next();
            try{
                nb = Integer.parseInt(ch);
            }catch(Exception e){
                nb = 0;
            }
        }while(nb <= 0);

        return nb;
    }

    public static void RemplirTab(int[][] tab, int n){
        Scanner sc = new Scanner(System.in);
        String ch;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ch = "";
                do{
                    System.out.print("Donner un entier T[" + i + "][" + j + "] : ");
                    ch = sc.next();
                    try{
                        tab[i][j] = Integer.parseInt(ch);
                    }catch(Exception e){
                        ch = "";
                    }
                }while(ch == "");
            }
        }
    }

    public static int CalculSomme(int[][] tab,int n, int i){
        int s = 0;
        for(int j = 0; j < n; j++){
            s+= tab[i][j];
        }

        return s;
    }

    public static void main(String[] args){
        int n = LectureN();
        int[][] tab = new int[n][n];
        String ch;
        int i = -1;
        Scanner sc = new Scanner(System.in);

        RemplirTab(tab, n);

        do{
            System.out.print("Donner un ligne : ");
            ch = sc.next();
            try{
                i = Integer.parseInt(ch);
            }catch(Exception e){
                ch = "";
            }
        }while(i > n || i < 0 || ch == "");

        int s = CalculSomme(tab, n, i);
        System.out.println("La somme de la ligne " + i + " est : " + s);
    }

}

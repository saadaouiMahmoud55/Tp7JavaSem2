import java.util.Scanner;

public class app2{
     public static int lecture(){
        Scanner scanner= new Scanner(System.in);
        int n;
        do { 
            System.out.println("entrez un entier strictement positive");
            n=scanner.nextInt();
        } while (n<=0);
        return n;
    }
    public static void RemplirTab(double[] tab){
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("T["+i+"]=");
            tab[i]=scanner.nextInt();  
        }
    }
    public static double Calcul_moy( double[] tab){
        double m=0;
        for (int i = 0; i <tab.length; i++) {
            m+=tab[i];    
        } return m/tab.length;
    }
    public static int Nombre_Note(double[] tab, double m){
        int cmpt=0;
        for (int i = 0; i < tab.length; i++) {
           if (tab[i] > m){
            cmpt++;
            
        }
    }
    return cmpt;
} 
public static void main(String[] args) {
    int n=lecture();
    double[] tab = new double[n];
    RemplirTab(tab);
    double m=Calcul_moy(tab);
    int note=Nombre_Note(tab,m);
    System.out.println("la moyenne est de "+m);

}
}

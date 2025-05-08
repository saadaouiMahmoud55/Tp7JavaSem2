import java.util.Scanner;
public class app1{
    public static int lecture(){
        Scanner scanner= new Scanner(System.in);
        int n;
        do { 
            System.out.println("entrez un entier strictement positive");
            n=scanner.nextInt();
        } while (n<=0);
        return n;
    }
    public static void RemplirTab(int[] tab){
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("T["+i+"]=");
            tab[i]=scanner.nextInt();  
        }
    }
    public static void Remplacer(int[] tab,int x1,int x2){
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]==x1);
            tab[i]=x2;
            }
    }
    public static void AfficheTab(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            System.out.println("T["+i+"]="+tab[i]);
    }
}
public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    int n=lecture();
    int[] tab=new int[n];
    RemplirTab(tab);
    System.out.println("donnez x1");
    int x1=lecture();
    System.out.println("donnez x2");
    int x2=lecture();
    Remplacer(tab,x1,x2);
    AfficheTab(tab);
}
}
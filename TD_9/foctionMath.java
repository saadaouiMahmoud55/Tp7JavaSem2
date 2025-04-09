import java.util.Scanner;

public class foctionMath {
    public static int lectureN() {
Scanner scanner = new Scanner (System. in);
int n;
do{
System.out.print("Entrez un entier strictement positif : ");
while (!scanner.hasNextInt()) {
    System.out.print("Entrez un entier strictement positif : ");
    n =scanner.nextInt();
}
n =scanner.nextInt();
if (n <= 0){
System.out.println(x: "Erreur : L'entier doit tre strictement positif.");
}while (n <= 0);
return n;
}
public static void main(String[] args) {
int [] entiers = new int [10]; 
System.out.println( "Yeuillez entrer 10 entiers strictement positifs :");
for (int i = 0; i < 10; i++) {
entiers [i] = lectureN();
}
}
}

import java.lang.annotation.Target;
import java.util.Scanner;
public class exercice_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String verbe,radicale;        
        
        do {
            System.out.println("donner une verbe");
            verbe =sc.nextLine();
        } 
        while(!verbe.endsWith("er") || verbe.equals("aller"));




        System.out.println("je "+verbe.replace("er","e"));
        System.out.println("tu "+verbe.replace("er","es"));
        System.out.println("il/elle "+verbe.replace("er","e"));
        if(verbe.equals("manger")){
            System.out.println("nous "+verbe.replace("er","ons"));
        } else if(verbe.equals("commencer")){
            System.out.println("nous "+verbe.replace("er","ons"));

        }
        System.out.println("vous "+verbe.replace("er","ez"));
        System.out.println("ils/elles "+verbe.replace("er","ent"));





}

    }

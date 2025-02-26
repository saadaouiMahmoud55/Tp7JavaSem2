import java.util.Scanner; 
public class tp1{  
	public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int x,j,i,nl,nc;
        boolean ok=false;
        int[][] M= new int[50][50];
        System.out.println(" entre le Nbr de Lig ");
        nl=sc.nextInt();
        while(nl>50){
            System.out.print("Entre le Nbr entre ");
            nl=sc.nextInt();
            
        }
        System.out.println(" entre le colonne de Lig ");
        nc=sc.nextInt();
        while(nc>50){
            System.out.print("Entre  le Nbr de colon  entre ");
            nc=sc.nextInt();

            
        }
        System.out.println("remplir le matrice ");
        for(i=0; i<nl;i++){
            for(j=0 ; j<nc ;j++){
                do{
                    System.out.println("M["+i+","+j+"]= ");
                M[i][j]=sc.nextInt();

                }
                while( M[i][j]%2!=0);
            }

        }
        do{
            System.out.print("donnee  un  entier x  ");
        x=sc.nextInt();
        

        }
        while( x %2!=0);
        i=0;
        j=0;

            while(!ok && i<nl && j<nc){
                if(M[i][j]== x){
                    ok=true;
                    

                }else if(i<nl && j==(nc-1)){
                    j=0;
                    i++;
                }else{
                    j++;
                }
            }
        if(ok){
            System.out.println(x+" existe");

        }else{
            System.out.println(x+" n existe pas");

        }

}
}
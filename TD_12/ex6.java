

public class ex6{
    public static int maxtab(int[]tab){
        if(tab.length==0){
            throw new IllegalArgumentException("un tableau vide n'a pas de maximum");
        }
        int max=tab[0];
        for (int i = 0; i < tab.length; i++) {
            if(tab[i]>max){
                max=tab[i];
            }
        }
        return max;
    }
    public static void main(String []args){
        int[]t=//{1,2,5,89,75,10};
        // {};
        {8};
        System.out.println("maxtab(t)");
    }
}
//package DSA;


class Gfg {
    static void print(int[] a ,int n){
        for (int i=0 ; i <n ; i++){
            for (int j= 0 ; j <n ; j++){
                //if(i!=j)
                System.out.println( a[i] + " " + a[j]);

            }
        }
    }
}
public class OmegaN {
    public static void main (String []args){
        int a[] = {1,2,3};

        int n= a.length;
        Gfg.print(a,n);

    }

}

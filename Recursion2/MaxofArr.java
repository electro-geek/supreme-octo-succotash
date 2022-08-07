import java.util.*;
public class MaxofArr {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        System.out.println(maxarr(a,0));
    }
    public static int maxarr(int[] a, int n){
        if(n == a.length-1){
            return a[n];
        }
        int misa = maxarr(a, n+1);
        if(misa > a[n]){
            return misa;
        }
        else{
            return a[n];
        }
    }
}

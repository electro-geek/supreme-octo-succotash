import java.util.*;
public class LastOfIndex {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(loiarr(a,n-1,target));
    }
    public static int loiarr(int[] a, int n, int target){
        if(n == 0){
            return -1;
        }
        if(a[n] == target){
            return n+1;
        }
        else{
            int x = loiarr(a, n-1, target);
            return x;
        }
    }
}

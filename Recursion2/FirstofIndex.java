import java.util.*;
public class FirstofIndex {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < a.length; i++){
        a[i] = scn.nextInt();
    }
    int ele = scn.nextInt();
    System.out.println(fisidxocc(a,0,ele));
    }
    public static int fisidxocc(int[] a, int n, int target){
        if(n == a.length-1){
            return -1;
        }
        // int x = fisidxocc(a, n+1, target);
        // if(a[n] == target){
        //     return n;
        // }
        // else{
        //     return x;
        // }
        if(a[n] == target){
            return n;
        }
        else{
            int x = fisidxocc(a,n+1,target);
            return x;
        }
    }
}

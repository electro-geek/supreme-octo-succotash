import java.util.*;
public class DisArrusingRec{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int idx = 0;
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i]  =scn.nextInt();
        }
        disparr(a, idx);
    }
    public static void disparr(int[] a, int idx){
        if(idx == a.length){
            return;
        }
        System.out.println(a[idx]);
        disparr(a, idx+1);
    }
}
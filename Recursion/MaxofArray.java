import java.util.*;
public class MaxofArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int idx = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        int v = arrmax(a, idx);
        System.out.println(v);
    }
    public static int arrmax(int[] a, int idx){
        if(idx == a.length){
            return 1;
        }
        int x = arrmax(a, idx+1);
        if(x < a[idx]){
            return a[idx];
        }
        else{
            return x;
        }
    }
}
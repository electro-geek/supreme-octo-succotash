import java.util.*;
public class DisReverseArr{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int idx = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        disreverse(a, idx);
    }
    public static void disreverse(int[] a, int idx){
        if(idx == a.length){
            return;
        }
        disreverse(a, idx+1);
        System.out.println(a[idx]);
    }
}
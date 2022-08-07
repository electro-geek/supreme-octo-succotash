import java.util.*;
public class FirstIndexofArr{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int idx = 0;
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int v= fioa(a, idx, target);
        System.out.println(v);
    }
    public static int fioa(int[] a, int idx, int target){
        if(idx == a.length){
            return -1;
        }
        int x = fioa(a, idx+1, target);
        if(a[idx] == target){
            return idx;
        }
        else{
            return x;
        }
    }
}
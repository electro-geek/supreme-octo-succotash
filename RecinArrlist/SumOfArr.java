import java.util.*;
public class SumOfArr {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int sum = soa(arr, 0);
        System.out.println(sum);
    }
    public static int soa(int[] a, int idx){
        if(idx == a.length-1){
            return a[idx];
        }
        int snp1 = soa(a,idx+1);
        int result = a[idx]+snp1;
        return result;
    }
}

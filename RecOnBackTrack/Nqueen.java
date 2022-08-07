import java.util.*;
public class Nqueen {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        printSubSet(0, arr, target, "");
    }
    public static void printSubSet(int idx, int[] arr, int target, String[] ans){
        
        printSubSet(idx+1, arr, )
    }
}

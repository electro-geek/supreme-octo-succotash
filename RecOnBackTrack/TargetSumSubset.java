import java.util.*;
public class TargetSumSubset {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        //function(Array, target value, empty string for subset, "0" for sum of all subset, "0" for idx of the array)
        printSubSet(arr,target,"",0,0);
    }
    public static void printSubSet(int[] arr, int target, String str, int sum, int idx){
        if(idx == arr.length){
            if(sum == target){
                System.out.println(str);
            }
            return;
        }
        printSubSet(arr, target, str+arr[idx]+",", sum+arr[idx], idx+1);
        printSubSet(arr, target, str, sum, idx+1);
    }
}

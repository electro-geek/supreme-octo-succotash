import java.util.*;
public class CoinChangePermutation {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i >= arr[j]){
                    dp[i] += dp[i - arr[j]];
                }
            }
        }
        System.out.println(dp[target]);
    }
}

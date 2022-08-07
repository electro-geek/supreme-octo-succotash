import java.util.*;
public class KnapSack {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for(int i = 0; i < n; i++){
            wt[i] = scn.nextInt();
        }
        for(int j = 0; j < n; j++){
            val[j] = scn.nextInt();
        }
        int cap = scn.nextInt();
        int[][] dp = new int[n+1][cap+1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(j >= wt[i-1]){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-wt[i-1]]+val[i-1]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}

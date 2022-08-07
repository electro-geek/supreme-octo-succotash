import java.util.*;
public class MaximumConSubArr {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i == j){
                    dp[i][j] = arr[i];
                }
                else{
                    dp[i][j] = arr[j]+dp[i][j-1];
                }
            }
        }
        int maxi = 0;
        int maxj = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(dp[i][j] > dp[maxi][maxj]){
                    maxi = i;
                    maxj = j;
                }
            }
        }
        System.out.println(dp[maxi][maxj]);
    }
}
sxed4
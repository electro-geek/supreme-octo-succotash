import java.util.*;
public class Goldmine {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++){
            dp[i][m-1] = arr[i][m-1];
        }
        
    }
}

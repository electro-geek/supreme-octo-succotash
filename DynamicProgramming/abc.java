import java.util.*;
public class abc {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] heights = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                heights[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[n][m];
        for(int i = n-1; i >= 0; i--){
            for(int j = m-1; j >= 0; j--){
                if(i == n-1 && j == m-1){
                    dp[i][j] = heights[i][j];
                }
                else if(i == n-1){
                    dp[i][j] = heights[i][j]+dp[i][j+1];
                }
                else if(j == m-1){
                    dp[i][j] = heights[i][j]+dp[i+1][j];
                }
                else{
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1])+heights[i][j];
                }
            }
        }
        // ArrayList<Integer> arr = new ArrayList<>();
        // int i = 0; 
        // int j = 0;
        // while(i < n && j < m){
        //     if(i == n-1){
        //         arr.add(heights[i][j]);
        //         j+= 1;
        //     }
        //     else if(j == m-1){
        //         arr.add(heights[i][j]);
        //         i += 1;
        //     }
        //     else{
        //         if(dp[i+1][j] > dp[i][j+1] || dp[i][j] == dp[i][j+1]){
        //             arr.add(heights[i][j+1]);
        //             j += 1;
        //         }
        //         else{
        //             arr.add(heights[i+1][j]);
        //             i += 1;
        //         }
        //     }
        // }
        // int min = Integer.MAX_VALUE;
        // for(int k = 0; k+1 < arr.size(); i++){
        //     int x = arr.get(k)-arr.get(k+1);
        //     min = Math.min(min, x);
        // }
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    
}

import java.util.*;
public class UnboundedKnapsack {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for(int i = 0; i < n; i++){
            val[i] = scn.nextInt();
        }
        for(int i = 0; i < n; i++){
            wt[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        int[] dp = new int[cap+1];
        dp[0] = 0;
        for(int bagc = 1; bagc < dp.length; bagc++){
            int max = 0;
            for(int i = 0; i < n; i++){
                if(bagc >= wt[i]){
                    int rbagc = bagc-wt[i];
                    int rval = dp[rbagc];
                    int tbagc = rval+val[i];

                    if(tbagc > max){
                        max = tbagc;
                    }
                }
                dp[bagc] = max;
            }
        }
        System.out.println(dp[cap]);
        
    }
}

import java.util.*;
public class GetStepPath {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        //these below lines are for doing this question with dp
        // int result = getSP(n, new int[n+1]);
        // System.out.println(result);
        //now to do it with tabulation
        int solution  = getPathTabulation(n);
        System.out.println(solution);
    }
    public static int getSP(int n, int[] qb){
        if(n==0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        if(qb[n] != 0){
            return qb[n];
        }

        //three calls for three jump
        int nm1 = getSP(n-1,qb);
        int nm2 = getSP(n-2,qb);
        int nm3 = getSP(n-3,qb);
        int count = nm1+nm2+nm3;

        //using dp we will store the value of the the count in question bank
        qb[n] = count;
        return count;
    }
    public static int getPathTabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            if(i == 1){
                dp[i] = dp[0];
            }
            else if(i==2){
                dp[i] = dp[i-1]+dp[i-2];
            }
            else{
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }
}

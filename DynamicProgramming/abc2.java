import java.util.*;
public class abc2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n ; i++){
            nums[i] = scn.nextInt();
        }
        int ex1inc = 0;
        int ex1exc = 0;
        int in1inc = nums[0];
        int in1exc = 0;
        for(int i = 1; i < nums.length; i++){
            int nin1inc = in1exc+nums[i];
            int nin1exc = Math.max(in1inc, in1exc);
            int nex1inc = ex1exc+nums[i];
            int nex1exc = Math.max(ex1inc,ex1exc);
            
            nin1inc = in1inc;
            nin1exc = in1exc;
            nex1inc = ex1inc;
            nex1exc = ex1exc;
        }
        System.out.println (Math.max(Math.max(ex1inc,ex1exc), in1exc));
    }
}

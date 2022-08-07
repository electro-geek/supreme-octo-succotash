import java.util.*;
public class problem2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        System.out.println(findDuplicate(a));
    }
    public static int findDuplicate(int[] nums) {
        int x = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    x = nums[j];
                }
            }
        }
        return x;
    }
}
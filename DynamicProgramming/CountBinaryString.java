import java.util.*;
public class CountBinaryString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] zero = new int[n+1];
        int[] one = new int[n+1];
        zero[1] = 1;
        one[1] = 1;
        for(int i = 2; i <= n; i++){
            zero[i] = one[i-1];
            one[i] = zero[i-1]+one[i-1];
        }
        System.out.println(zero[n]+one[n]);
    }
}

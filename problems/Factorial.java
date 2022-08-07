import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = fact(n);
        System.out.println(x);
    }
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn;
    }
}
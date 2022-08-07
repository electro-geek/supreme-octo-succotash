import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = fact(n);
        System.out.println(f);
    }
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        int fnmi = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }
}
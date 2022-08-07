import java.util.*;
public class Fibbonaci{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sol = fibn(n);
        System.out.println(sol);
    }
    public static int fibn(int n){
        if(n==0){
            return 0;
        }
        int fnm1 = fibn(n-1);
        int fnm2 = fibn(n-2);
        int fibn = fnm1+fnm2;
        return fibn;
    }
}
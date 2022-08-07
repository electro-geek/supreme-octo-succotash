import java.util.*;
public class Fibonnaci {
    //all this code is a bad code, because it call the function for same values again and again
    // public static void main(String[] args){
    //     Scanner scn = new Scanner(System.in);
    //     int n = scn.nextInt();
    //     int sol = fib(n);
    //     System.out.println(sol);
    // }
    // public static int fib(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     int fnm1 = fib(n-1);
    //     int fnm2 = fib(n-2);
    //     int fbn = fnm1+fnm2;

    //     return fbn;
    // }
    //---------------************----------------
    // NEW CODE
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //adding a empty array to store the result of the calls to the values "fib(n, array )"
        int sol = fib(n, new int[n+1]);
        System.out.println(sol);
    }
    public static int fib(int n, int[] qb){
        if(n==0||n==1){
            return n;
        }
        if(qb[n] != 0){
            return qb[n];
        }
        System.out.println(n);
        int fnm1 = fib(n-1,qb);
        int fnm2 = fib(n-2, qb);
        int fbn = fnm1+fnm2;
        qb[n] = fbn;
        return fbn;
    }
}

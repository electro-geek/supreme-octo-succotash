import java.util.*;
public class Power{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int p = powerFunction(x,n);
        System.out.println(p);
    }
    public static int powerFunction(int x, int n){
        if(n == 0){
            return 1;
        }
        int nm1 = powerFunction(x,n-1);
        int p = x*nm1;
        return p;
    }
}
import java.util.*;
public class Power{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int y = powerofx(x,n);
        System.out.println(y);
    }
    public static int powerofx(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = powerofx(x,n-1);
        int p = x*xnm1;
        return p;
    }
}
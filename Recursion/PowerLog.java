import java.util.*;
public class PowerLog{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int xton = pol(x,n);
        System.out.println(xton);
    }
    public static int pol(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnby2 = pol(x, n/2);
        int xn = xnby2*xnby2;
        if(n%2 == 1){
            xn = x*xn;
        }
        return xn;
    }
}
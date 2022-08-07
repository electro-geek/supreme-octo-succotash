import java.util.*;
public class powern {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        System.out.println(pow(p,n));
    }
    public static int pow(int p, int n){
        if(n==1){
            return p;
        }
        int pnm1 = pow(p,n-1);
        int pn = p*pnm1;
        return pn;
    }
}

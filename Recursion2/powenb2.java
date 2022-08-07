import java.util.*;
public class powern {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        System.out.println(pown(p,n));
    }
    public static int pown(int p, int n){
        if(n == 1){
            return p;
        }
        int pownb2 = pown(p,n/2);
        int pow = pownb2*pownb2;
        if(n%2 == 1){
            pow = pow * p;
        }
        return pow;
    }
}

import java.util.*;
public class decreasingnumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdecn(n);
    }
    public static void pdecn(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pdecn(n-1);
    }
}

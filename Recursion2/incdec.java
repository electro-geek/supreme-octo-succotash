import java.util.*;
public class incdec {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pincdec(n);
    }
    public static void pincdec(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        pincdec(n-1);
        System.out.println(n);
    }
}

import java.util.*;
public class PrintZigzag{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Zigzag(n);
    }
    public static void Zigzag(int n){
        if(n == 0){
            return;
        }
        System.out.print(n);
        Zigzag(n-1);
        System.out.print(n);
        Zigzag(n-1);
        System.out.print(n);
    }
}
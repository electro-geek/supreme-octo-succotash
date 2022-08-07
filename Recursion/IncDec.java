import java.util.*;
public class IncDec{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncDec(n);
    }
    public static void printIncDec(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printIncDec(n-1);
        System.out.println(n);
    }
}
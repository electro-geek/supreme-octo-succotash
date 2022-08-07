import java.util.*;
public class abc{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printAPS(n,"");
    }
    public static void printAPS(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        for(int i = 1; i <= n; i++){
            printAPS(n-i, ans+i+"-");
        }

        // System.out.println(count);
    }
}
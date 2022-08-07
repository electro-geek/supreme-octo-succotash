import java.util.*;
public class pattern11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j == x){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            x--;
            System.out.println();
        }
    }
}

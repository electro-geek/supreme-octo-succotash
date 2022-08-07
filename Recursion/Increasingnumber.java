import java.util.*;
public class Increasingnumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pin(n);
    }
    public static void pin(int n){
        if(n == 0){
            return;
        }
        pin(n-1);
        System.out.println(n);
    }
}
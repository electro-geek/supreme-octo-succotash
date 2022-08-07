import java.util.*;
public class increasingnumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pnumber(n);
    }
    public static void pnumber(int n){
        if(n == 0){
            return;
        }
        pnumber(n-1);
        System.out.println(n);
    }

}
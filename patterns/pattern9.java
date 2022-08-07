import java.util.*;
public class pattern9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int str = 1, sp = n/2;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= str; j++){
                System.out.print("* ");
            }
            if(i < n/2){
                str += 1;
                sp -= 1;
            }
            else{
                str -= 1;
                sp += 1;
            }
            System.out.println();
        }
    }
}

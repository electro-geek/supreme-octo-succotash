import java.util.*;
public class primenumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t = scn.nextInt();
        for(int i = 2; i <= t; i++){
            int count = 0;
            for(int div = 2; div*div = i; div++){
                if(i%div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("")
            }
        }
    }
}

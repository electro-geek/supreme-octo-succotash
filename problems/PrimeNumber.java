import java.util.*;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        for(int div = 2; div*div <= n; div++){
            // int count = 0;
            if(n%div == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Prime");
        }
        else{
            System.out.println("not Prime");
        }
    }
}
import java.util.*;
public class CountBinaryString2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int oone = 1;
        int ozero = 1;
        for(int i = 2; i <= n; i++){
            int none = oone+ ozero;
            int nzero = oone;

            oone = none;
            ozero = nzero;
        }
        System.out.println(oone+ozero);
    }
}

import java.util.*;
public class ArrangeBuilding {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ob = 1;
        int os = 1;
        for(int i = 1; i < n; i++){
            int nb = os;
            int ns = ob+os;

            os = ns;
            ob = nb;
        }
        int total = os+ob;
        total = total*total;
        System.out.println(total);
    }
}
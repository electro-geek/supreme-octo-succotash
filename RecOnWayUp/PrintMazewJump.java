import java.util.*;
public class PrintMazewJump {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMJW(1,1,n,m,"");
    }
    public static void printMJW(int sr, int sc, int dr, int dc, String ans){
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        for(int i = 1; i <= dr-sr; i++){
            printMJW(sr+i, sc, dr,dc, ans+"h"+i);
        }
        for(int i = 1; i <= dc-sc; i++){
            printMJW(sr, sc+i, dr,dc, ans+"v"+i);
        }
        for(int i = 1 ; i <= dr-sr && i <= dc-sc; i++){
            printMJW(sr+i, sc+i, dr,dc, ans+"d"+i);
        }
    }
}

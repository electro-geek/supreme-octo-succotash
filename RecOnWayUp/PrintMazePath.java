import java.util.*;
public class PrintMazePath {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMP(1,1,n,m,"");
    }
    public static void printMP(int sr, int sc, int dr, int dc, String ans){
        if(sr == dr && sc == dc){
            System.out.println(ans);
            return;
        }
        if(sr > dr || sc > dr){
            return;
        }
        printMP(sr, sc+1, dr, dc, ans+"h");
        printMP(sr+1, sc, dr,dc, ans+"v");
    }
}

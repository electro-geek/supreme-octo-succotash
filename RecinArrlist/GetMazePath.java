import java.util.*;
public class GetMazePath {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> sol = getMP(1,1,n,m);
        System.out.println(sol);
    }
    public static ArrayList<String> getMP(int sr, int sc, int dr, int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hrres = new ArrayList<>();
        ArrayList<String> vrres = new ArrayList<>();
        if(sr<dr){
            hrres = getMP(sr+1, sc, dr, dc);
        }
        if(sc < dc){
            vrres = getMP(sr, sc+1, dr, dc);
        }
        ArrayList<String> mres = new ArrayList<>();
        for(String val : hrres){
            mres.add("h"+val);
        }
        for(String val : vrres){
            mres.add("v" + val);
        }
        return mres;
    }
}

import java.util.*;
public class GetMazePathJump {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> sol = getMPJ(1,1,n,m);
        System.out.println(sol);
    }
    public static ArrayList<String> getMPJ(int sr, int sc, int dr, int dc){
        if(sc == dc && sr == dr){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(sc > dc || sr > dr){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> hrres = new ArrayList<>();
        ArrayList<String> vrres = new ArrayList<>();
        ArrayList<String> drres = new ArrayList<>();
        ArrayList<String> mres = new ArrayList<>();
        for(int ms = 1; ms <= dc-sc; ms++){
            hrres = getMPJ(sr+ms, sc, dr, dc);
            for(String val : hrres){
                mres.add("h"+ms+val);
            }
        }
        for(int ms = 1; ms <= dr-sr; ms++){
            vrres = getMPJ(sr, sc+ms, dr, dc);
            for(String val : vrres){
                mres.add("v"+ms+val);
            }
        }
        for(int ms = 1; ms <= dr-sr && ms <= dc-sc; ms++){
            drres = getMPJ(sr+1, sc+1, dr, dc);
            for(String val : drres){
                mres.add("d"+ms+val);
            }
        }
        return mres;
    }
}

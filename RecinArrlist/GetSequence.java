import java.util.*;
public class GetSequence {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> val = gss(str);
        System.out.println(val);
    }
    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String res = str.substring(1);
        ArrayList<String> reos = gss(res);
        ArrayList<String> mres = new ArrayList<>();
        for(String val: reos){
            mres.add("" + val);
            mres.add(ch+val);
        }
        return mres;
    }
}

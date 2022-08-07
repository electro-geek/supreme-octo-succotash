import java.util.*;
public class GetKPC {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
        // int sum = 0;
        ArrayList<String> sol = getKPC(word);
        // for(int i = 0; i < sol.size(); i++){
        //     String str = sol.get(i);
        //     for(int j = 0; j < str.length(); j++){
        //         char ch = str.charAt(j);
        //         int v = Character.getNumericValue(ch);
        //         sum += v;
        //     }
        //     if(sum < 1000)
        //     {
        //         System.out.println(sol.get(i));
        //     }
        // }
        System.out.println(sol);
    } 
    static String[] code = {";?", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }       
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();
        String codeforch = code[ch -'0'];
        for(int i = 0; i < codeforch.length(); i++){
            char charfromcode = codeforch.charAt(i);
            for(String val : rres){
                mres.add(charfromcode + val);
            }
        }
        return mres;
    }
}

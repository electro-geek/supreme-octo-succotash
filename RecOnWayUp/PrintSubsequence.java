import java.util.*;
public class PrintSubsequence{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
        pss(word,"");
    }
    public static void pss(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String rques = ques.substring(1);
        pss(rques, ans+ch);
        pss(rques, ans+"");
    }
}
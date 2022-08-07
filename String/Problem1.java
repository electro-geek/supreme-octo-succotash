//String With Difference Of Every Two Consecutive Characters
import java.util.*;
public class Problem1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(Solution(s));

    }
    public static String Solution(String s){
        StringBuilder sb = new StringBuilder(s);
        String d = sb.charAt(0)+"";
        int i = 0;
        for(int j = 1; j < sb.length(); j++){
            char pv = sb.charAt(i);
            char curr = sb.charAt(j);
            int num = curr-pv;
            d += num;
            d += curr;
            i++;

        }
        return d;
    }
}
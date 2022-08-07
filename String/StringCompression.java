import java.util.*;
public class StringCompression{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        firstcompression(s);
        secondcompression(s);
    }
    public static void firstcompression(String s){
        int i = 0;
        String d = s.charAt(i)+"";
        for(int j = 1; j < s.length(); j++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1 != c2){
                d += c2;
            }
            i++;
        }
        System.out.println(d);
    }
    public static void secondcompression(String s){
        int i = 0;
        String d = s.charAt(i)+"";
        int count = 1;
        for(int j = 1; j < s.length()-1; j++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1 == c2){
                count++;
            }
            else{
                if (count >= 1) {
                    d += count;
                    count = 1;
                    d += c2;
                }
            }
            i++;
        }
        System.out.print(d);
    }
}
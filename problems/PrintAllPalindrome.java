import java.util.*;
public class PrintAllPalindrome{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length(); j++){
                String s1 = s.substring(i,j);
                if(isPalindrome(s1) == true){
                    System.out.println(s1);
                }
            }
        }
    }
    public static boolean isPalindrome(String s){
        int li = 0;
        int ri = s.length()-1;
        while(li < ri){
            char c1 = s.charAt(li);
            char c2 = s.charAt(ri);
            if(c1 == c2){
                li++;
                ri--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
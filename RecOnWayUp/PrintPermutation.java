import java.util.*;
public class PrintPermutation {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPM(str, "");
    }
    public static void printPM(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i < ques.length(); i++){
            char ch = ques.charAt(i);
            String remain = ques.substring(0,i)+ques.substring(i+1);
            printPM(remain, ans+ch);
        }
    }
}

import java.util.*;
public class GetStepPath {
       public static void main(String[] args){
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
           ArrayList<String> paths = getPath(n);
           System.out.println(paths);
       }
       public static ArrayList<String> getPath(int n){
           if(n==0){
               ArrayList<String> bres = new ArrayList<>();
               bres.add("");
               return bres;           
           }
           else if(n < 0){
               ArrayList<String> bres = new ArrayList<>();
               return bres;
           }
           ArrayList<String> nm1 = getPath(n-1);
           ArrayList<String> nm2 = getPath(n-2);
           ArrayList<String> nm3 = getPath(n-3);
           ArrayList<String> mres = new ArrayList<>();
           for(String val : nm1){
               mres.add("1"+val);
           }
           for(String val : nm2){
            mres.add("2"+val);
           }
           for(String val : nm3){
            mres.add("3"+val);
           }
           return mres;
       }
}

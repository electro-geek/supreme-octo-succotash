import java.util.*;
public class problem1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a  = new int[n][m];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = scn.nextInt();
            }
        }
        int target = scn.nextInt();
        System.out.println((findtheElement(a, target)));
    }
    public static boolean findtheElement(int[][] a, int t){
        for(int i = 0; i < a.length; i++){
            int j = a[0].length-1;
            while(j >= 0){
                if(t == a[i][j]){
                    return true;
                }
                j--;
            }
        }
        return false;
    }
}
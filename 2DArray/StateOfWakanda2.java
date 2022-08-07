// State of wakanda-2 in which we have to print the upper triangle of matrix
import java.util.*;
public class StateOfWakanda2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = scn.nextInt();
            }
        }
        for(int gap = 0; gap < a[0].length; gap++){
            for(int i = 0, j = gap; j < a[0].length; j++,i++){
                System.out.println(a[i][j]);
            }
        }
    }
}
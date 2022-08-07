import java.util.*;
public class FillNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n*n];
        fillUpMatrix(a, n); 
    }
    public static void fillUpMatrix(int[] a, int n){
        for(int i = 0; i < n; i++){
            a[i] = i+1;
        }
        int[][] m = new int[n][n];
        int count = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                m[i][j] = a[count];
            }
            count++;
        }
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
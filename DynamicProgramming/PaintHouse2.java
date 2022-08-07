import java.util.*;
public class PaintHouse2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[3][n];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int r = arr[0][0];
        int g = arr[1][0];
        int b = arr[2][0];
        for(int j = 1; j < n; j++){
            r = Math.min(g, b) + arr[0][j];
            g = Math.min(r, b) + arr[1][j];
            b = Math.min(r,g) + arr[2][j];
        }
        int min = Math.min(Math.min(r,g),b);
        System.out.println(min);
    }
}

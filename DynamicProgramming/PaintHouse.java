import java.util.*;
public class PaintHouse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[3][n];
        for(int i = 0; i < 3; i ++){
            for(int j = 0 ; j < n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int r = arr[0][0];
        int b = arr[1][0];
        int g = arr[2][0];
        for(int j = 1 ; j < n; j++){
            for(int i = 0; i < 3; i++){
                int nr = Math.min(b,g)+arr[i][j];
                int nb = Math.min(r,g)+arr[i][j];
                int ng = Math.min(r,b)+arr[i][j];

                r = nr;
                b = nb;
                g = ng;
            }
        }
        System.out.println(Math.min(Math.min(r,b),g));
    }
}

import java.util.*;
public class ShellRotate{
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
        int s = scn.nextInt();
        int r = scn.nextInt();
        rotateshell(a, s, r);
        display(a);
    }
    public static void display(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotateshell(int[][] a, int s, int r){
        int[] oned = fillonedfromshell(a, s);
        rotateshell(oned, r);
        fillfromoned(oned, a, s);
    }
    public static int[] fillonedfromshell(int[][] a, int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = a.length-s;
        int maxc = a[0].length-s;
        int size = 2*(maxc+maxr-minr-minc);
        int[] oned = new int[size];
        int count = 0;
        //Loading left-wall
        for(int i = minr, j = minc; i <= maxr; i++){
            oned[count] = a[i][j];
            count++;
        }
        minc++;
        //loading bottom-wall
        for(int i = maxc, j = minc; j <= maxc; j++){
            oned[count] = a[i][j];
            count++;
        }
        maxr--;
        for(int i = maxr, j = maxc; i >= minr; i--){
            oned[count] = a[i][j];
            count++;
        }
        maxc--;
        for(int i = minr, j = maxc; j >= minc; j--){
            oned[count] = a[i][j];
            count++;
        }
        return oned;
    }
    public static void rotateshell(int[] oned, int r){
        r = r%oned.length;
        if(r < 0){
            r =  r+oned.length;
        }
        reverse(oned, 0, oned.length-r-1);
        reverse(oned, oned.length-r, oned.length-1);
        reverse(oned, 0, oned.length-1);
    }
    public static void reverse(int[] a, int i, int j){
        int li = 0;
        int ri = a.length-1;
        while(li < ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }
    public static void fillfromoned(int[] oned, int[][] a, int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = a.length-s;
        int maxc = a[0].length-s;
        // int size = 2*(maxc+maxr-minr-minc);
        // int[] oned = new int[size];
        int count = 0;
        //Loading left-wall
        for(int i = minr, j = minc; i <= maxr; i++){
            a[i][j] = oned[count];
            count++;
        }
        minc++;
        //loading bottom-wall
        for(int i = maxc, j = minc; j <= maxc; j++){
            a[i][j] = oned[count];
            count++;
        }
        maxr--;
        for(int i = maxr, j = maxc; i >= minr; i--){
            a[i][j] = oned[count];
            count++;
        }
        maxc--;
        for(int i = minr, j = maxc; j >= minc; j--){
            a[i][j] = oned[count];
            count++;
        }
    }
}
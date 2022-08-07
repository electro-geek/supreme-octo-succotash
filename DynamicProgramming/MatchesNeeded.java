import java.util.*;
public class MatchesNeeded{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int[][] arr = new int[10][7];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int n= scn.nextInt();
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            for(int j = 0; j < arr[0].length; j++){
                if(arr[rem][j] == 1){
                    sum += 1;
                }
            }
            n = (n-rem)/10;
        }
        System.out.println(sum);
    }
}
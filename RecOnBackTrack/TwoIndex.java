import java.util.*;
public class TwoIndex {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int target = scn.nextInt();
        for(int i = 0 ; i < a.length; i++){
            a[i] = scn.nextInt();
        }
        printSum(0,1,n,n,a,target);
    }
    public static void printSum(int si, int sj, int di, int dj,int[] a, int target){
        if(a[si]+a[sj] == target){
            System.out.println("("+si+","+sj+")");
            return;
        }
        else if(a[si]+a[sj] != target){
            return;
        }
        else if(sj == dj){
            return;
        }
        else if(si == di){
            return;
        }
        if(sj <= dj){
            printSum(si, sj+1, di, dj, a, target);
        }
        
        if(si < sj){
            printSum(si+1, sj, di, dj, a, target);
        }
    }
}

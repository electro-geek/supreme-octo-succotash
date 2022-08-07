import java.util.*;
public class DisplayArray{
    public static void main(String[] args){ 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }
    // display(a,n-1);
    display(a,0);
    }
    // public static void display(int[] a, int n){
    //     if(n < 0){
    //         return;
    //     }
    //     System.out.println(a[n]);
    //     display(a,n-1);
    //     System.out.println(a[n]);
    // }
    public static void display(int[] a, int n){
        if(n == a.length){
            return;
        }
        //this will display array 
        System.out.println(a[n]);
        display(a,n+1);
        //this line will print array in reverse
        System.out.println(a[n]);
    }
}
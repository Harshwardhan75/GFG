//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total testcases
        int t = sc.nextInt();
        int[] arr=new int[45];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<45;i++)
            arr[i]=arr[i-1]+arr[i-2];

        while (t-- > 0) {

            // taking count of stairs
            int m = sc.nextInt();

            // creating an object of class DynamicProgramming
            Solution obj = new Solution();



            System.out.println(obj.countWays(m,arr));
            // calling method countWays() of class
            // DynamicProgramming

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countWays(int n,int[] arr) {
        // your code here
        return arr[n];
    }
}

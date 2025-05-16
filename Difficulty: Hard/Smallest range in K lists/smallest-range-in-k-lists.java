//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

public class DriverClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[][] = new int[k][n];
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
            }
            ArrayList<Integer> range = new Solution().findSmallestRange(arr);
            System.out.println(range.get(0) + " " + range.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    class Pair{
        int value;
        int row,col;
        
        Pair(int v,int r,int c){
            value = v;
            row = r;
            col = c;
        }
    }
    public ArrayList<Integer> findSmallestRange(int[][] arr) {
        // code here
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{
            int v=a.value-b.value;
            return v;
        });
        
        int k=arr.length;
        int n=arr[0].length;
        int max= 0;
        
        for(int i=0;i<k;i++){
            pq.offer(new Pair(arr[i][0],i,0));
            max=Math.max(max,arr[i][0]);
        }     
        int range = Integer.MAX_VALUE;
        int[] result=new int[2];
        
        while(pq.size()==k){
            Pair p = pq.poll();
            
            if(max-p.value<range){
                range = max-p.value;
                result[0]=p.value;
                result[1]=max;
            }
            
            if(p.col+1<n){
                pq.offer(new Pair(arr[p.row][p.col+1],p.row,p.col+1));
                max=Math.max(max,arr[p.row][p.col+1]);
            }
        }
        
        return new ArrayList<>(Arrays.asList(result[0],result[1]));
    }
}
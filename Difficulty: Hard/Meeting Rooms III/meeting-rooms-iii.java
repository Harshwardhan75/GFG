//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of rooms
            int m = sc.nextInt(); // Number of meetings
            int[][] meetings = new int[m][2];
            for (int i = 0; i < m; i++) {
                meetings[i][0] = sc.nextInt(); // Start time
                meetings[i][1] = sc.nextInt(); // End time
            }
            Solution ob = new Solution();
            System.out.println(ob.mostBooked(n, meetings));
            System.out.println("~");
        }
        sc.close();
    }
}


// } Driver Code Ends

// User function Template for Java
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        // code here
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        
        int[] result=new int[n];
        
        PriorityQueue<Integer> room=new PriorityQueue<>();
        
        for(int i=0;i<n;i++)
            room.offer(i);
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            int v=a[0]-b[0];
            if(v==0)
                v=a[1]-b[1];
            return v;
        });

        for(int i=0;i<meetings.length;i++){
            while(!pq.isEmpty() && pq.peek()[0]<=meetings[i][0])
                room.offer(pq.poll()[1]);
            
            if(!room.isEmpty()){
                int r=room.poll();
                result[r]++;
                pq.offer(new int[]{meetings[i][1],r});
            }
            else{
                int[] first=pq.poll();
                int duration = meetings[i][1] - meetings[i][0];
                pq.offer(new int[]{duration+first[0],first[1]});
                result[first[1]]++;
            }
        }
        
        int max = -1;
        int value = 0;
        
        for(int i=0;i<n;i++){
            // System.out.print(result[i]+" ");
            if(result[i]>max){
                max=result[i];
                value=i;
            }    
        }
        // System.out.println();
        
        return value;
    }
}


//{ Driver Code Starts.
// } Driver Code Ends
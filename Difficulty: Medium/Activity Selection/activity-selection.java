//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- > 0) {
            // Read the start times
            String[] startInput = reader.readLine().trim().split("\\s+");
            int[] start = new int[startInput.length];
            for (int i = 0; i < startInput.length; i++) {
                start[i] = Integer.parseInt(startInput[i]);
            }

            // Read the end times
            String[] endInput = reader.readLine().trim().split("\\s+");
            int[] finish = new int[endInput.length];
            for (int i = 0; i < endInput.length; i++) {
                finish[i] = Integer.parseInt(endInput[i]);
            }

            // Create solution object and call activitySelection
            Solution obj = new Solution();
            System.out.println(obj.activitySelection(start, finish));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here.
        ArrayList<int[]> arr=new ArrayList<>();
        int n=start.length;
        for(int i=0;i<n;i++)
            arr.add(new int[]{start[i],finish[i]});
        
        Collections.sort(arr,(a,b)->a[1]-b[1]);
        int lasttime = -1;
        int count = 0;
        
        for(int[] i: arr){
            if(i[0]>lasttime){
                lasttime=i[1];
                count++;
            }
        }
        return count;
    }
}

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();

            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            line = read.readLine();
            tokens = line.split(" ");
            for (String token : tokens) {
                array2.add(Integer.parseInt(token));
            }

            // ArrayList<Integer> v = new ArrayList<Integer>();
            int[] gas = new int[array1.size()];
            int idx = 0;
            for (int i : array1) gas[idx++] = i;

            int[] cost = new int[array2.size()];
            idx = 0;
            for (int i : array2) cost[idx++] = i;

            int ans = new Solution().startStation(gas, cost);

            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int startStation(int[] gas, int[] cost) {
        // Your code here
        int n=gas.length;
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<n;i++){
            sum1+=gas[i];
            sum2+=cost[i];
        }
        
        if(sum1<sum2)
            return -1;
        
        int currentgas=0;
        int ans = 0;
        
        int left = 0;
        int right = 0;
        
        while(right<n){
            currentgas+=gas[right]-cost[right];
            
            while(currentgas<0){
                currentgas+=-gas[left]+cost[left];
                left++;
            }
            right++;
        }
        return left;
        
    }
}

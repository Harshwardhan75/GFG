//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    
    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
        // Your code here
        int[] freq=new int[100001];
        for(int i: arr) freq[i]++;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int v=freq[a]-freq[b];
            if(v==0)
                v=a-b;
            return v;
        });
        
        for(int i=1;i<100001;i++){
            if(freq[i]>0)
                pq.offer(i);
            
            if(pq.size()>k)
                pq.poll();
        }
        
        ArrayList<Integer> result =  new ArrayList<>();
        while(!pq.isEmpty())
            result.add(pq.poll());
        Collections.reverse(result);
        return result;
    }
}



//{ Driver Code Starts.

public class Main {
    public static void main(String args[]) throws IOException {
        // taking input using class Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // taking total number of elements
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            ArrayList<Integer> res = new Solution().topKFrequent(arr, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends
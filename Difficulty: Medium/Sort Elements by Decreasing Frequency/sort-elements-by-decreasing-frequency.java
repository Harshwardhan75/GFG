//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Map.Entry;


// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        Map<Integer,Integer> map=new HashMap<>();
        for(int i: arr) map.compute(i,(k,v)->v==null?1:v+1);
        
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int v=map.get(b)-map.get(a);
            if(v==0)
                v=a-b;
            return v;
        });
        
        for(int i: map.keySet())    pq.offer(i);
        
        ArrayList<Integer> result=new ArrayList<>();
        
        while(!pq.isEmpty()){
            int n=pq.poll();
            int freq=map.get(n);
            
            while(freq-->0)   result.add(n);
        }
        
        return result;
    }
}


//{ Driver Code Starts.

class Driverclass {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        while (n != 0) {
            String input = sc.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans = new Solution().sortByFreq(arr);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();
            n--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends
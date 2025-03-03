//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends


class Solution {

    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        int n = arr.length;
        
        int left = 0, right = 0;
        int start = -1, maxlength = 0;
        
        TreeMap<Integer,Integer> tmap=new TreeMap<>();
        
        while(right<n){
            tmap.compute(arr[right],(k,v)->v==null?1:v+1);
            
            while(tmap.lastKey()-tmap.firstKey()>x){
                tmap.put(arr[left],tmap.get(arr[left])-1);
                
                if(tmap.get(arr[left])==0)
                    tmap.remove(arr[left]);
                left++;
            }
            
            if(right-left+1>maxlength){
                start=left;
                maxlength=right-left+1;
            }
            right++;
        }
        
        if (start == -1) return new ArrayList<>();
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start; i < start + maxlength; i++) {
            result.add(arr[i]);
        }
        
        return result;
    }
}


//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

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

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.longestSubarray(arr, k);

            // Print the result as a space-separated string
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after printing the results
            System.out.println("~");
        }
    }
}

// } Driver Code Ends
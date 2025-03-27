//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // First array input (arr)
            String[] str1 = br.readLine().trim().split(
                " "); // Read the first line and split by spaces
            int n = str1.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] =
                    Integer.parseInt(str1[i]); // Convert each element to an integer
            }

            // Second array input (dep)
            String[] str2 = br.readLine().trim().split(
                " "); // Read the second line and split by spaces
            int m = str2.length;
            int[] dep = new int[m];
            for (int i = 0; i < m; i++) {
                dep[i] =
                    Integer.parseInt(str2[i]); // Convert each element to an integer
            }

            Solution obj = new Solution();
            System.out.println(obj.findPlatform(arr, dep));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        int n=arr.length;
        int count = 0;
        int max = 0;
        
        // int[][] arri=new int[n][];
        
        // for(int i=0;i<n;i++){
        //     arri[i]=new int[]{arr[i],dep[i]};    
        // }
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        // Arrays.sort(arri,(a,b)->a[0]-b[0]);
        
        int i=0,j=0;
        while(i<n){
            if(arr[i]<=dep[j]){
                count++;
                i++;
            }
            else{
                j++;
                count--;
            }
            max=Math.max(max,count);
        }
        
        return max;
    }
}

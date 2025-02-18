//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Arrays.sort(arr);
        int count =0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int rem=target-arr[i];
            int ind=upperbound(arr,rem);
            count+=ind;
            if(ind>i)
                count--;
        }
        
        return count/2;
    }
    
    int upperbound(int[] arr,int rem){
        int low=0,high=arr.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=rem)
                high=mid-1;
            else
                low=mid+1;
        }
        
        return low;
    }
}


//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.countPairs(nums, target));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
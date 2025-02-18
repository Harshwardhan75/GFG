//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    public int maxWater(int arr[]) {
        // code here
        int leftmax=-1,rightmax=-1;
        int low=0,high=arr.length-1;
        int count=0;
        while(low<=high){
            if(arr[low]<arr[high]){
                if(leftmax>arr[low])
                    count+=leftmax-arr[low];
                else
                    leftmax=arr[low];
                low++;
            }
            else{
                if(rightmax>arr[high])
                    count+=rightmax-arr[high];
                else
                    rightmax=arr[high];
                    high--;
            }
        }
        
        return count;
    }
}

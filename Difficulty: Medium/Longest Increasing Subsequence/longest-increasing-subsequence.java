//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine())
                               .trim()
                               .split(" "); // Read the input for the current test case
            int arr[] = new int[str.length];
            // Convert input string into an integer array
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            // Call the solution method and print the result
            System.out.println(new Solution().lis(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static int lis(int arr[]) {
        // code here
        ArrayList<Integer> lis=new ArrayList<>();
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int f=BS(lis,arr[i]);
            if(f>=lis.size())
                lis.add(arr[i]);
            else
                lis.set(f,arr[i]);
        }
        
        return lis.size();
    }
    
    static int BS(ArrayList<Integer> arr,int x){
        int low=0,high=arr.size()-1;
        
        while(low<=high){
            int mid=(low+high)>>1;
            
            if(arr.get(mid)<x)
                low=mid+1;
            else
                high=mid-1;
        }
        
        return low;
    }
}
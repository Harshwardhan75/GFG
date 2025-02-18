//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        int low=0,high=arr.length-1;
        int diff=Integer.MAX_VALUE;
        List<Integer> result=new ArrayList<>();
        int a=-1,b=-1;
        
        while(low<high){
            int sum=arr[low]+arr[high];
            if(Math.abs(target-sum)<diff){
                diff=Math.min(Math.abs(target-sum),diff);
                a=arr[low];
                b=arr[high];
            }
            
            if(sum<target)
                low++;
            else if(sum> target)
                high --;
            else
                return new ArrayList<>(Arrays.asList(a,b));
        }
        
        return a==-1?new ArrayList<>():new ArrayList<>(Arrays.asList(a,b));
    }
}
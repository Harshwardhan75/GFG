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




// User function Template for Java

class Solution {

    int[] pse(int[] arr){
        int[] result=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                st.pop();
            
            result[i]=st.isEmpty()?i:st.peek();
            st.push(i);
        }
        return result;
    }
    
    int[] nse(int[] arr){
        int[] result=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                st.pop();
            
            result[i]=st.isEmpty()?i:st.peek();
            st.push(i);
        }
        return result;
    }

    public int maxWater(int arr[]) {
        // Code Here
        
        int left=0,right=arr.length-1;
        int max=0;
        while(left<right){
            if(arr[left]<arr[right]){
                max=Math.max(max,(right-left)*arr[left]);
                left++;
            }
            else{
                max=Math.max(max,(right-left)*arr[right]);
                right--;
            }
        }
        
        return max;
    }
}
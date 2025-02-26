//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String line = sc.nextLine();
            String[] input = line.split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
            Solution solution = new Solution();
            ArrayList<Integer> result = solution.maxOfMins(arr);
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends



class Solution {
    
    int[] pse(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] result=new int[n];
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])  st.pop();
            
            result[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return result;
    }
    
    int[] nse(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] result=new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])  st.pop();
            
            result[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return result;
    }
    
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code here
        int[] pse=pse(arr);
        int[] nse=nse(arr);
        int n=arr.length;
        
        int[] ws=new int[n+1];
        
        for(int i=0;i<n;i++){
            ws[nse[i]-pse[i]-1]=Math.max(ws[nse[i]-pse[i]-1],arr[i]);
        }
        
        for(int i=n-1;i>=0;i--){
            ws[i]=Math.max(ws[i],ws[i+1]);
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            result.add(ws[i]);
        }
        
        return result;
    }
}
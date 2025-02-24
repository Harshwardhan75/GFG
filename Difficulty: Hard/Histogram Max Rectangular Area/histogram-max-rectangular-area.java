//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int max=0;
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                int element=arr[st.peek()];
                st.pop();
                int nse=i;
                int pse = st.isEmpty()?-1:st.peek();
                
                max=Math.max(max,(nse-pse-1)*element);
            }
            
            st.push(i);
        }
        
        while(!st.isEmpty()){
            int element=arr[st.peek()];
                st.pop();
                int nse=n;
                int pse = st.isEmpty()?-1:st.peek();
                
                max=Math.max(max,(nse-pse-1)*element);
        }
        
        return max;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
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
            Solution obj = new Solution();
            int res = obj.getMaxArea(arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends
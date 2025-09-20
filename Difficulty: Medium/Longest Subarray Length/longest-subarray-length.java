class Solution {
    public static int longestSubarray(int[] arr) {
        // code here
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        
        int max = 0;
        int n = arr.length;
        
        // System.out.println(Arrays.toString(pse));
        // System.out.println(Arrays.toString(nse));
        
        
        for(int i=0;i<n;i++){
            int length = nse[i]-pse[i]-1;
            if(length>=arr[i]){
                max = Math.max(max,length);
            }
        }
        
        return max;
    }
    
    static int[] findNSE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] result = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
                st.pop();
            
            result[i] = st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return result;
    }
    
    static int[] findPSE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
                st.pop();
            
            result[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return result;
    }
}
class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        int result = 0;
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] NSE = new int[n];
        int[] PSE = new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                st.pop();
            
            NSE[i] = st.isEmpty()?n:st.peek();
            st.push(i);
        }
        
        st = new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
                st.pop();
            
            PSE[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        
        // System.out.println(Arrays.toString(PSE));
        // System.out.println(Arrays.toString(NSE));
        
        for(int i=0;i<n;i++){
            int left = i - PSE[i];
            int right = NSE[i] - i;
            result = result + ((left * right)*arr[i]);
        }
        
        return result;
    }
}

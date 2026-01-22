class Solution {
    public int subarrayRanges(int[] arr) {
        // code here
        return max(arr) - min(arr);
    }
    
    int[] findPGE(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i])
                st.pop();
                
            result[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return result;
    }
    
    int[] findNGE(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
                st.pop();
            
            result[i] = st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return result;
    }
    
    int max(int[] arr){
        int[] PGE = findPGE(arr);
        int[] NGE = findNGE(arr);
        
        int count = 0;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int left = i - PGE[i];
            int right = NGE[i] - i;
            
            count += (left*right*arr[i]);
        }
        
        return count;
    }
    
    int[] findPSE(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                st.pop();
            
            result[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        
        return result;
    }
    
    int[] findNSE(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
                st.pop();
            
            result[i] = st.isEmpty()?n:st.peek();
            st.push(i);
        }
        
        return result;
    }
    
    int min(int[] arr){
        int[] PSE = findPSE(arr);
        int[] NSE = findNSE(arr);
        
        int count = 0;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int left = i - PSE[i];
            int right = NSE[i] - i;
            
            count += (left*right*arr[i]);
        }
        
        return count;
    }
}

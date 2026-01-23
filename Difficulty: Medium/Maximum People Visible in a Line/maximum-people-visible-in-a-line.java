class Solution {
    public int maxPeople(int[] arr) {
        // code here
        int[] PGE = findPGE(arr);
        int[] NGE = findNGE(arr);
        // System.out.println(Arrays.toString(PGE));
        // System.out.println(Arrays.toString(NGE));
        int max = 0;
        
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,NGE[i]-PGE[i]-1);
        }
        
        return max;
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
            while(!st.isEmpty() && arr[st.peek()]<arr[i])
                st.pop();
            
            result[i] = st.isEmpty()?n:st.peek();
            st.push(i);
        }
        
        return result;
    }
}

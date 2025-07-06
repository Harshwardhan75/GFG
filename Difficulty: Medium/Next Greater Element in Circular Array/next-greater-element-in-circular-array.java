class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        
        Stack<Integer> st=new Stack<>();
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%n])
                st.pop();
            
            if(i<n)
                result.add(
                    st.isEmpty()?-1:st.peek()
                );
            
            st.push(arr[i%n]);
        }
        
        Collections.reverse(result);
        
        return result;
    }
}
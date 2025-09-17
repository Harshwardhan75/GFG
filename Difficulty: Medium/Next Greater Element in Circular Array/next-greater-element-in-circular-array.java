class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 2*n-1;i>=0;i--){
            int validIndex = i%n;
            while(!st.isEmpty() && st.peek()<=arr[validIndex]){
                st.pop();
            }
            if(i<=n-1)
                result.add(st.isEmpty()?-1:st.peek());
            st.push(arr[validIndex]);
        }
        
        Collections.reverse(result);
        
        return result;
    }
}
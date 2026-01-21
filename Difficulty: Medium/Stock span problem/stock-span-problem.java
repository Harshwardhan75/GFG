class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            
            result.add(st.isEmpty()?i+1:i-st.peek());
            st.push(i);
        }
        
        return result;
    }
}
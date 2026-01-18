class Solution {

    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int[] freq = new int[100001];
        for(int i: arr)
            freq[i]++;
        
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && freq[arr[st.peek()]]<=freq[arr[i]]){
                st.pop();
            }
            
            result.add(st.isEmpty()?-1:arr[st.peek()]);
            st.push(i);
        }
        
        Collections.reverse(result);
        return result;
    }
}
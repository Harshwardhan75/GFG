class Solution {
    public ArrayList<Integer> findGreater(int[] arr) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        for(int i: arr) map.compute(i,(k,v)->v==null?1:v+1);
    
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && map.get(st.peek())<=map.get(arr[i]))
                st.pop();
            
            result.add(
                st.isEmpty()?-1:st.peek()
            );
        
            st.push(arr[i]);
        }
        
        Collections.reverse(result);
        return result;
    }
}
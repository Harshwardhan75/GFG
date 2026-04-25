class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        for(int i: arr){
            while(!st.isEmpty() && Math.abs(st.peek())<Math.abs(i)
                && ((st.peek()<0 && i>0) || (st.peek()>0 && i<0)))
                st.pop();
            
            if(!st.isEmpty() && Math.abs(st.peek())==Math.abs(i) &&
                ((st.peek()<0 && i>0) || (st.peek()>0 && i<0)))
                st.pop();
            else if(!st.isEmpty() &&
                ((st.peek()>0 && i>0) || (st.peek()<0 && i<0))){
                st.push(i);
            }
            else if(st.isEmpty())
                st.push(i);
        }
        
        ArrayList<Integer> result = new ArrayList<>(st);
        return result;
    }
}
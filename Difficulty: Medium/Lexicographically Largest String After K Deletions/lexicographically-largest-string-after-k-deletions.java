class Solution {
    public static String maxSubseq(String s, int k) {
        // code here
        Stack<Character> st=new Stack<>();
        
        for(char c: s.toCharArray()){
            while(k>0 && !st.isEmpty() && st.peek()<c){
                st.pop();
                k--;
            }
            
            st.push(c);
        }
        
        while(k-->0 && !st.isEmpty())
            st.pop();
        
        StringBuilder sb=new StringBuilder();
        
        while(!st.isEmpty())
            sb.append(st.pop());
        
        return sb.reverse().toString();
    }
}
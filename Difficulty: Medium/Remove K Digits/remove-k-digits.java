class Solution {
    public String removeKdig(String s, int k) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(char c: s.toCharArray()){
            
            while(k>0 && !st.isEmpty() && st.peek()>c)
            {
                k--;
                st.pop();
            }
            
            st.push(c);
        }
        
        
        while(!st.isEmpty() && k>0){
            k--;
            st.pop();
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())    sb.append(st.pop());
        
        int i = sb.length()-1;
        
        while(i>=0 && sb.charAt(i)=='0')
            i--;
        
        if(i<=-1)
            return "0";
        
        return new StringBuilder(sb.toString().substring(0,i+1)).reverse()
                .toString();
    }
}
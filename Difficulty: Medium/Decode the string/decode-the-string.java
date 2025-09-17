class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            
            if(c!=']'){
                st.push(c);
            }
            else{
                StringBuilder sb = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    sb.append(st.pop());
                }
                
                if(!st.isEmpty()){
                    st.pop();
                }
                
                StringBuilder value = new StringBuilder();
                
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    value.append(st.pop());
                }
                
                value.reverse();
                sb.reverse();
                int val = Integer.parseInt(value.toString());
                for(int x=0;x<val;x++){
                    for(int j = 0;j<sb.length();j++)
                        st.push(sb.charAt(j));
                }
            }
        }
        
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty())
            result.append(st.pop());
        return result.reverse().toString();
    }
}
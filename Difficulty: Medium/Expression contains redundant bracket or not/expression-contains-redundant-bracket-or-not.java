class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(char c: s.toCharArray()){
            if(c!=')')
                st.push(c);
            else{
                boolean op = false;
                while(!st.isEmpty() && st.peek()!='('){
                    if("+-*/".contains(st.peek()+""))
                        op =  true;
                        
                    st.pop();
                }
                
                st.pop();
                if(!op)
                    return true;
            }
        }
        
        return false;
    }
}

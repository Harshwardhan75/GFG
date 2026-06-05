class Solution {
    public String lexicographicallySmallest(String s, int k) {
        // code here
        int n = s.length();
        
        if((n&(n-1))==0){
            k /= 2;
        }
        else{
            k *= 2;
        }
        
        Stack<Character> st = new Stack<>();
        
        for(char c: s.toCharArray()){
            while(k>0 && !st.isEmpty() && st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        
        while(k-->0 && !st.isEmpty())
            st.pop();
        
        if(st.isEmpty())
            return "-1";
        
        StringBuilder result = new StringBuilder();
        
        while(!st.isEmpty())
            result.append(st.pop());
        
        return result.reverse().toString();
    }
}
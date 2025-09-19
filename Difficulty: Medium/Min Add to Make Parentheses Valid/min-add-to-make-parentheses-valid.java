class Solution {
    public int minParentheses(String s) {
        // code here
        int count = 0;
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c=='(')
                sum++;
            else
                sum--;
            
            if(sum<0){
                count++;
                sum = 0;
            }
        }
        
        return count+sum;
    }
}

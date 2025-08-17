// User function Template for Java

class Solution {
    String findSum(String s1, String s2) {
        // code here
        StringBuffer sb = new StringBuffer();
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum = (sum + s1.charAt(i)-'0');
                i--;
            }
            if(j>=0){
                sum = (sum + s2.charAt(j)-'0');
                j--;
            }
            
            carry = sum/10;
            sum%=10;
            sb.append(sum);
        }
        
        if(carry>=1)
            sb.append('1');
        
        while(sb.length()>1 && sb.charAt(sb.length()-1)=='0')
            sb.deleteCharAt(sb.length()-1);
        
        return sb.reverse().toString();
    }
}
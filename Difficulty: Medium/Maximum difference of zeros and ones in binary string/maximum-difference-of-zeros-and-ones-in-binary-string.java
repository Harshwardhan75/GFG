// User function Template for Java

class Solution {
    int maxSubstring(String s) {
        // code here
        int sum = 0;
        int max = -1;
        
        for(int i = 0;i<s.length();i++){
            sum+=(s.charAt(i)=='1')?-1:1;
            
            max = Math.max(max,sum);
            sum = Math.max(sum,0);
        }
        
        return max;
    }
}
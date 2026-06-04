class Solution {
    int maxSubstring(String s) {
        // code here
        int left = 0, right = 0;
        int n = s.length();
        
        int zero = 0;
        int one = 0;
        int max = Integer.MIN_VALUE;
        
        while(right<n){
            if(s.charAt(right)=='0')
                zero++;
            else 
                one++;
            
            max = Math.max(max,zero-one);
            
            while(one>zero){
                if(s.charAt(left)=='0')
                    zero--;
                else 
                    one--;
                
                left++;
            }
            
            right++;
        }
        
        return Math.max(max,-1);
    }
}

/*
    1   1   0   0   0   0   1   0   0   0   1
    -1 -2  -1   0   1   2   1  3   4   5   4
*/
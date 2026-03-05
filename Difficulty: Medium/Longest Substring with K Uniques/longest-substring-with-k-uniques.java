class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int unique = 0;
        int[] freq = new int[26];
        
        int left = 0, right = 0, n = s.length();
        int max = -1;
        
        while(right<n){
            int index = s.charAt(right)-'a';
            
            if(freq[index]==0)
                unique++;
            
            freq[index]++;
            
            if(unique>k){
                index = s.charAt(left)-'a';
                freq[index]--;
                if(freq[index]==0)
                    unique--;
                
                left++;
            }
            else if(unique==k){
                max = Math.max(max,right-left+1);
            }
            
            right++;
        }
        
        return max;
    }
}
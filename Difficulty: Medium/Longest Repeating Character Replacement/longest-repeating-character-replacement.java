class Solution {
    public int longestSubstr(String s, int k) {
        // code here
        int[] freq = new int[26];
        int n = s.length();
        int left = 0, right = 0;
        int max = 0;
        int longest = 0;
        while(right<n){
            char c = s.charAt(right);
            freq[c-'A']++;
            max = Math.max(max,freq[c-'A']);    
            
            int length = right - left + 1;
            
            int changesRequired = length - max;
            
            while(changesRequired>k){
                c = s.charAt(left);
                freq[c-'A']--;
                max = Arrays.stream(freq).max().orElse(0);
                left ++;
                length = right - left + 1;
                changesRequired = length - max;
            }
            
            
            longest = Math.max(longest,length);
            right++;
        }
        return longest;
    }
}

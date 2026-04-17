class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        int[] freq = new int[26];
        for(char c: s.toCharArray())    freq[c-'a']++;
        
        int odd = 0;
        
        for(int i: freq)
            odd += i%2;
        
        return odd<=1;
    }
}
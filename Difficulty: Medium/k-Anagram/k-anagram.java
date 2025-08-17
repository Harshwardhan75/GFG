class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length()!=s2.length())
            return false;
            
        int[] freq = new int[26];
        for(char c: s1.toCharArray())
            freq[c-'a']++;
            
        for(char c: s2.toCharArray())
            freq[c-'a']--;
        
        int count = 0;
        
        for(int i: freq)
            if(i>0)
                count += i;
        
        // System.out.println(count);
        
        return count<=k;
    }
}
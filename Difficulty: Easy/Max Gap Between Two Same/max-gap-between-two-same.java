class Solution {
    public int maxCharGap(String s) {
        // code here
        int[] freq = new int[26];
        Arrays.fill(freq,-1);
        int max = -1;
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']!=-1){
                max = Math.max(max,i-freq[s.charAt(i)-'a']-1);
            }
            else{
                freq[s.charAt(i)-'a'] = i;
            }
        }
        return max;
    }
};
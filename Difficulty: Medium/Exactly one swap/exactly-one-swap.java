class Solution {
    int countStrings(String s) {
        // code here
        int count = 0;
        int n=s.length();
        
        int[] freq=new int[26];
        for(char c: s.toCharArray())
            freq[c-'a']++;
        
        int ans = 0;
        int flag = 0;
        
        for(char c: s.toCharArray()){
            if(freq[c-'a']>1)
                flag = 1;
            ans+=n-freq[c-'a'];
        }
        ans/=2;
        ans+=flag;
        return ans;
    }
}

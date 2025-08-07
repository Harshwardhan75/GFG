class Solution {
    int getLPSLength(String s) {
        // code here
        int n=s.length();
        int[] lps = new int[n];
        int pre = 0, suf = 1;
        
        while(suf<n){
            if(s.charAt(pre)==s.charAt(suf)){
                lps[suf]=pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0){
                    lps[suf]=0;
                    suf++;
                }
                else
                    pre = lps[pre-1];
            }
        }
        
        return lps[n-1];
    }
}
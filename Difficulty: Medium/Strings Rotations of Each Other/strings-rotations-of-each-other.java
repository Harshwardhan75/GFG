class Solution {
    public boolean areRotations(String s1, String s2) {
        // code here
        s1 += s1;
        int[] lps = find(s2);
        int first = 0, second = 0;
        // System.out.println(Arrays.toString(lps));
        
        while(first<s1.length() && second<s2.length()){
            if(s1.charAt(first)==s2.charAt(second)){
                first++;
                second++;
            }
            else{
                if(second==0)
                    first++;
                else
                    second=lps[second-1];
            }
        }
        
        return second == s2.length();
    }
    
    int[] find(String s){
        int n = s.length() , pre = 1, suf = 0;
        int[] lps = new int[n];
        
        while(pre<n){
            if(s.charAt(pre)==s.charAt(suf)){
                lps[pre] = suf+1;
                pre++;
                suf++;
            }
            else{
                if(suf==0)
                    pre++;
                else
                    suf = lps[suf-1];
            }
        }
        
        return lps;
    }
    
}
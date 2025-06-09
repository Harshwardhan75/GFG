// User function Template for Java

class Solution {
    public static int minChar(String s) {
        // Write your code here
        String reverse=new StringBuilder(s).reverse().toString();
        int[] lps=findLPS(s+"#"+reverse);
        return s.length()-lps[lps.length-1];
    }
    
    static int[] findLPS(String s){
        int n=s.length();
        int pre=0,suf=1;
        int[] lps=new int[n];
        
        while(suf<n){
            if(s.charAt(pre)==s.charAt(suf)){
                lps[suf]=pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0)
                    suf++;
                else
                    pre=lps[pre-1];
            }
        }
        
        return lps;
    }
}
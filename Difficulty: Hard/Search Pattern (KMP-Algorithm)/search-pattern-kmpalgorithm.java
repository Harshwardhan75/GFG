// User function Template for Java

class Solution {
    int[] findLPS(String pattern){
        int n=pattern.length();
        int[] lps=new int[n];
        
        int pre=0,suf=1;
        
        while(suf<n){
            if(pattern.charAt(pre)==pattern.charAt(suf)){
                lps[suf]=pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0)
                {
                    lps[suf]=0;
                    suf++;
                }
                else
                    pre=lps[pre-1];
            }
        }
        
        return lps;
    }
    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> arr=new ArrayList<>();
        int[] lps=findLPS(pat);
        
        int first=0;
        int second = 0;
        int n=txt.length();
        int m=pat.length();
        
        while(first<n){
            if(txt.charAt(first)==pat.charAt(second)){
                first++;
                second++;
            }
            else{
                if(second==0)
                    first++;
                else
                    second=lps[second-1];
            }
            
            if(second==m){
                arr.add(first-second);
                second=lps[second-1];
            }
        }
        
        return arr;
    }
}
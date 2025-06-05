class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        // Code here
        int[] lps=findLPS(pat);
        int first = 0;
        int second = 0;
        
        int n=pat.length();
        int m=txt.length();
        ArrayList<Integer> result=new ArrayList<>();
        
        while(second<m){
            if(pat.charAt(first)==txt.charAt(second)){
                first++;
                second++;
            }
            else{
                if(first==0){
                    second++;
                }
                else{
                    first=lps[first-1];
                }
            }
            
            if(first==n){
                result.add(second-first+1);
                first=lps[first-1];
            }
        }
        
        return result;
    }
    
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
                if(pre==0){
                    lps[suf]=0;
                    suf++;
                }
                else{
                    pre=lps[pre-1];
                }
            }
        }
        
        return lps;
    }
}
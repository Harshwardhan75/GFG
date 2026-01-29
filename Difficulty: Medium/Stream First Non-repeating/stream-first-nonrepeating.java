class Solution {
    public String firstNonRepeating(String s) {
        // code here
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(freq[c-'a']==0)
                freq[c-'a'] = i+1;
            else
                freq[c-'a'] = -1;
            
            int min = Integer.MAX_VALUE;
            for(int j=0;j<26;j++){
                if(freq[j]>0){
                    min = Math.min(min,freq[j]);
                }
            }
            // System.out.println(min);
            c = min==Integer.MAX_VALUE?'#':s.charAt(min-1);
            sb.append(c);
        }
        
        return sb.toString();
    }
}
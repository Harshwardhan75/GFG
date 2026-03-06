class Solution {
    public static String minWindow(String s, String p) {
        // code here
        int[] freq = new int[26];
        boolean[] set = new boolean[26];
        for(char c: p.toCharArray()){
            freq[c-'a']++;
            set[c-'a'] = true;
        }
        
        int left = 0, right = 0, n = s.length();
        int count = 0;
        int min=Integer.MAX_VALUE;
        int resultIndex = -1;
        
        while(right<n){
            int index = s.charAt(right)-'a';
            
            if(set[index]){
                freq[index]--;
                count++;
            }
            
            while(count>=p.length() && check(freq)){
                if(right-left+1<min){
                    min = right-left+1;
                    resultIndex = left;
                }
                
                if(set[s.charAt(left)-'a']){
                    freq[s.charAt(left)-'a']++;
                    count--;
                }
                left++;
            }
            right++;
        }
        
        if(min!=Integer.MAX_VALUE && resultIndex!=-1)
            return s.substring(resultIndex,resultIndex+min);
        
        return "";
    }
    
    static boolean check(int[] freq){
        for(int i: freq){
            if(i>0)
                return false;
        }
        
        return true;
    }
}
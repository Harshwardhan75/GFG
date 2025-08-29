class Solution {
    public static String smallestWindow(String s, String p) {
        // code here
        int[] freq =  new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        
        int length = p.length();
        int right = 0;
        int left = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int index = -1;
        
        while(right<s.length()){
            char c=s.charAt(right);
            if(freq[c-'a']>0){
                count++;    
            }
            
            freq[c-'a']--;
            
            while(count==length){
                c=s.charAt(left);
                freq[c-'a']++;
                if(freq[c-'a']>0)
                    count--;
                
                if((right-left+1)<min){
                    min = right-left+1;
                    index = left;
                }
                
                left++;
            }
            
            right++;
        }
        if(index==-1)
            return "";
            
        return s.substring(index,index+min);
    }
}
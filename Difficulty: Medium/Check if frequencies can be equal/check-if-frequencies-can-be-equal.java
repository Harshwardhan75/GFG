class Solution {
    boolean sameFreq(String s) {
        // code here
        int[] freq=new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        
        boolean status = false;
        
        Set<Integer> set=new HashSet<>();
            
            for(int j=0;j<26;j++){
                if(freq[j]>0)
                    set.add(freq[j]);
            }
            
            if(set.size()<=1)
                return true;
        
        for(int i=0;i<26;i++){
            if(freq[i]==0)  continue;
            
            freq[i]--;
            set=new HashSet<>();
            
            for(int j=0;j<26;j++){
                if(freq[j]>0)
                    set.add(freq[j]);
            }
            
            freq[i]++;
            
            if(set.size()<=1)
                return true;
        }
        
        return false;
    }
}
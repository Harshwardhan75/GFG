class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int left = 0,right = 0;
        int n=s.length();
        
        Map<Character,Integer> map=new HashMap<>();
        int max = -1;
        
        while(right<n){
            char c=s.charAt(right);
            map.compute(c,(kk,vv)->vv==null?1:vv+1);
            
            if(map.size()>k){
                c=s.charAt(left);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                    map.remove(c);
                
                left++;
            }
            
            if(map.size()==k){
                max=Math.max(max,right-left+1);
            }
            
            right++;
        }
        
        return max;
    }
}
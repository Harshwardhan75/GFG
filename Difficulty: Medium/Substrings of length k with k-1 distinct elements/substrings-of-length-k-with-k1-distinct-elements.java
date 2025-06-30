class Solution {
    public int substrCount(String s, int k) {
        // code here
        Map<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int count = 0;
        int left = 0;
        
        for(int right=0;right<n;right++){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            
            if(right>=k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0)
                    map.remove(s.charAt(left));
                left++;
            }
            
            if(right>=k-1 && map.size()==k-1)
                count++;
        }
        
        return count;
    }
}
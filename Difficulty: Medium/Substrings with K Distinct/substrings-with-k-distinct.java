// User function Template for Java

class Solution {
    int countSubstr(String s, int k) {
        // your code here
        return find(s,k)-find(s,k-1);
    }
    
    int find(String s,int k){
        Map<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int left = 0;
        int right = 0;
        int count = 0;
        
        while(right<n){
            map.compute(s.charAt(right),(kk,v)->v==null?1:v+1);
            
            while(map.size()>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0)
                    map.remove(s.charAt(left));
                    
                left++;
            }
            

            count+=right-left+1;
            
            right++;
        }
        
        return count;
    }
}
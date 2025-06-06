
class Solution {
    public int longestCommonSum(int[] a1, int[] a2) {
        // Code here
        int current = 0;
        int n=a1.length;
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        
        for(int i=0;i<n;i++){
            current+=a1[i];
            current-=a2[i];
            
            if(map.containsKey(current))
                max=Math.max(max,i-map.get(current));
            
            if(!map.containsKey(current))
                map.put(current,i);
        }
        
        return max;
    }
}
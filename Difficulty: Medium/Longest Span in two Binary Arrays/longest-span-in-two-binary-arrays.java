class Solution {
    public int equalSumSpan(int[] a1, int[] a2) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        
        int a = 0 , b = 0;
        int n = a1.length;
        map.put(0,-1);
        int max = 0;
        
        for(int i=0;i<n;i++){
            a+=a1[i];
            b+=a2[i];
            
            if(map.containsKey(a-b))
                max = Math.max(max,i-map.get(a-b));
            else
                map.put(a-b,i);
        }
        
        return max;
    }
}
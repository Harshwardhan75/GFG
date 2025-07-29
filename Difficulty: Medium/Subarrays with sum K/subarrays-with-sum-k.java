class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix = 0;
        int n=arr.length;
        int count = 0;
        
        for(int i=0;i<n;i++){
            prefix+=arr[i];
            
            count += map.getOrDefault(prefix-k,0);
            map.compute(prefix,(kk,vv)->vv==null?1:vv+1);
        }
        
        return count;
    }
}
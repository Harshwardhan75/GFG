class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        Map<Integer,Integer> map=new HashMap<>();
        int count = 0;
        map.put(0,1);
        
        int prefix = 0;
        for(int i: arr){
            prefix+=i;
            count+=map.getOrDefault(prefix,0);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        
        return count;
    }
}

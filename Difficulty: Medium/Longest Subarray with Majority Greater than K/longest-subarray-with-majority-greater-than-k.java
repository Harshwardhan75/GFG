
// User function Template for Java
class Solution {
    static int longestSubarray(int[] arr, int k) {
        // Code Here
        int n=arr.length;
        int max = 0;
        int prefix=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        
        for(int i=0;i<n;i++){
            prefix+=arr[i]>k?1:-1;
            
            if(prefix>0)
                max=i+1;
            else if(map.containsKey(prefix-1))
                max=Math.max(max,i-map.get(prefix-1));
            
            if(!map.containsKey(prefix))
                map.put(prefix,i);
        }
        
        return max;
    }
}


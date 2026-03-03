class Solution {
    public int totalElements(int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        int right = 0, left = 0;
        int n = arr.length;
        int max = 0;
        
        while(right<n){
            map.compute(arr[right],(k,v)->v==null?1:v+1);
            
            if(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0)
                    map.remove(arr[left]);
                
                left++;
            }
            else
                max = Math.max(max,right-left+1);
            right++;
        }
        
        return max;
    }
}
class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int left = 0;
        int right = 0;
        int count = 0;
        
        Map<Integer,Integer> map=new HashMap<>();
        
        while(right<arr.length){
            map.compute(arr[right],(kk,vv)->vv==null?1:vv+1);
            
            while(map.size()>k){
                map.put(arr[left],map.get(arr[left])-1);
                
                if(map.get(arr[left])==0)
                    map.remove(arr[left]);
                
                left++;
            }
            
            count+=right-left+1;
            right++;
        }
        
        return count;
    }

}

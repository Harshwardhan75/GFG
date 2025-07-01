class Solution {
    public int totalElements(int[] arr) {
        // code here
        int left = 0,right = 0;
        int max = 0;
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        
        while(right<n){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            
            if(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                
                if(map.get(arr[left])==0)
                    map.remove(arr[left]);
                    
                left++;
            }
            
            if(map.size()<=2)
                max=Math.max(max,right-left+1);
            
            right++;
        }
        
        return max;
    }
}
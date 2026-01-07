class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.compute(arr[i],(kk,vv)->vv==null?1:vv+1);
            
            if(i>=k-1){
                result.add(map.size());
                
                map.put(arr[i+1-k],map.get(arr[i+1-k])-1);
                
                if(map.get(arr[i+1-k])==0)
                    map.remove(arr[i+1-k]);
            }
        }
        
        return result;
    }
}
class Solution {
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        // code here
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int[] q: queries){
            ArrayList<Integer> temp = map.getOrDefault(q[2],new ArrayList<>());
            result.add(find(temp,q[0],q[1]));
        }
        
        return result;
    }
    
    int find(ArrayList<Integer> arr,int l,int r){
        return upper_bound(arr,r) - lower_bound(arr,l) + 1;
    }
    
    int upper_bound(ArrayList<Integer> arr,int value){
        int low = 0, high = arr.size()-1;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(arr.get(mid)<=value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return high;
    }
    
    int lower_bound(ArrayList<Integer> arr,int value){
        int low = 0, high = arr.size()-1;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(arr.get(mid)>=value)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return low;
    }
}
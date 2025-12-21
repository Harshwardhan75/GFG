class Solution {
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int[] q: queries){
            int f = first(arr,q);
            int l = last(arr,q);
            
            result.add(l-f+1);
        }
        
        return result;
    }
    
    int first(int[] arr,int[] q){
        int low = q[0],high = q[1], value = q[2];
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(arr[mid]>=value)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return low;
    }
    
    int last(int[] arr,int[] q){
        int low = q[0],high = q[1], value = q[2];
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(arr[mid]<=value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return high;
    }
}
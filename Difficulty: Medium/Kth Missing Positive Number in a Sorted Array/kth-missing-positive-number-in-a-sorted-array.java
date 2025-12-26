class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int low = 0, high = arr.length-1;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if((arr[mid]-(mid+1))<k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return low + k;
    }
}
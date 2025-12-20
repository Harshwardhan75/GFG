class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int low = 0, high = arr.length-1;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(arr[mid]>=k)
                high = mid -1;
            else
                low = mid + 1;
        }
        
        return low;
    }
};
class Solution {
    public int binarySearchable(int[] arr) {
        // code here
        int count = 0;
        
        for(int i: arr){
            if(check(arr,i))
                count++;
        }
        
        return count;
    }
    
    boolean check(int[] arr,int val){
        int low = 0, high = arr.length-1;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(arr[mid]==val)
                return true;
            
            if(arr[mid]<val)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return false;
    }
};
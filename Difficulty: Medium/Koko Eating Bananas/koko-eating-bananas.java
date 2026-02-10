class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low = 1, high = Arrays.stream(arr).max().orElse(0);
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(possible(arr,k,mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return low;
    }
    
    boolean possible(int[] arr,int k,int mid){
        int total = 0;
        
        for(int i: arr){
            total += (i+mid-1)/mid;
        }
        
        return total<=k;
    }
}

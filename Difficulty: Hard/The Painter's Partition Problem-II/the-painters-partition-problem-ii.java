class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int low = Arrays.stream(arr).max().orElse(0);
        int high = Arrays.stream(arr).sum();
        
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
        int req = 1;
        int currLoad = 0;
        
        for(int i: arr){
            if(i+currLoad<=mid){
                currLoad+=i;
            }
            else{
                currLoad = i;
                req++;
            }
        }
        
        return req<=k;
    }
}

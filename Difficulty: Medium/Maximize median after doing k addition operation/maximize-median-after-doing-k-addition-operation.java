class Solution {
    public int maximizeMedian(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        
        // int low = n%2==1?arr[n/2]:arr[n/2]+arr[(n/2)-1];
        int low = 0;
        int high = arr[n-1] + k;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(possible(arr,mid,k))
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return high;
    }
    
    boolean possible(int[] arr,int mid,int k){
        int n = arr.length;
        
        long sum = 0;
        if(n%2==1){
            sum = mid - arr[n/2];
        }
        else{
            sum = (mid-arr[n/2]) + (mid-arr[(n/2)-1]); 
        }
        
        for(int i=(n/2) + 1;i<n;i++){
            if(arr[i]<mid)
                sum += mid - arr[i];
            
            if(sum>k)
                return false;
        }
        
        return sum<=k;
    }
}

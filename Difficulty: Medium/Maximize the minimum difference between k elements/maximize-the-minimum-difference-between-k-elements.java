class Solution {
    public int maxMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int low = 1, high = arr[n-1]-arr[0];
        
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
        long last = Integer.MIN_VALUE;
        int count = 0;
        for(int i: arr){
            if(i-last>=mid){
                count++;
                last = i;
            }
        }
        
        return count>=k;
    }
}

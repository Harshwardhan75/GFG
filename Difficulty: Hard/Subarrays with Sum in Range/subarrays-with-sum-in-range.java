class Solution {
    public int countSubarray(int[] arr, int l, int r) {
        // code here
        int n = arr.length;
        long[] prefix = new long[n];
        
        long p = 0;
        
        for(int i=0;i<n;i++){
            p += arr[i];
            prefix[i] = p;
        }
        
        int count = 0;
        
        for(int i=0;i<n;i++){
            long minus = i == 0 ? 0:prefix[i-1];
            
            int left = find(prefix,i,n-1,l,minus);
            int right = find(prefix,i,n-1,r+1,minus);
            
            right --;
            
            count += right - left + 1;
        }
        
        return count;
    }
    
    int find(long[] prefix,int low,int high,int value,long minus){
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(prefix[mid]-minus>=value)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return low;
    }
}
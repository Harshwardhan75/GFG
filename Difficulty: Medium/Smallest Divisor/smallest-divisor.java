class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int low=1;
        int high=Arrays.stream(arr).max().orElseThrow();
        
        while(low<=high){
            int mid=(low+high)>>1;
            
            if(count(arr,mid)<=k)
                high=mid-1;
            else
                low=mid+1;
        }
        
        return low;
    }
    
    int count(int[] arr,int mid){
        int count=0;
        
        for(int i: arr)
            count+=(int)Math.ceil((double)i/(double)mid);
        
        return count;
    }
}
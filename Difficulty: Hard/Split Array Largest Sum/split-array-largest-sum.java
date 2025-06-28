class Solution {
    //Subarray Partition Problem
    //Painters Partition Problem
    //Student Page Allocation Problem
    public int splitArray(int[] arr, int k) {
        // code here
        int low = Arrays.stream(arr).max().orElseThrow();
        int high = Arrays.stream(arr).sum();
        
        while(low<=high){
            int mid=(low+high)>>1;
            int count=find(arr,mid);
            if(count<=k)
                high=mid-1;
            else
                low=mid+1;
        }
        
        return low;
    }
    
    int find(int[] arr,int mid){
        int curr=0;
        int count = 1;
        
        for(int i: arr){
            if(curr+i<=mid){
                curr+=i;
            }
            else{
                curr=i;
                count++;
            }
        }
        
        return count;
    }
};
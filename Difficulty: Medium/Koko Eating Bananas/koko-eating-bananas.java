class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low = 1;
        int n=arr.length;
        int high = Arrays.stream(arr).max().orElseThrow();
        
        while(low<=high){
            int mid=(low+high)>>1;
            if(possible(arr,mid)<=k)
                high=mid-1;
            else
                low=mid+1;
        }
        
        return low;
    }
    
    int possible(int[] arr,int mid){
        int n=arr.length;
        int totalHours=0;
        
        for(int i: arr){
            totalHours+=(int)Math.ceil((double)i/(double)mid);
        }
        
        return totalHours;
    }
}

class Solution {
    public int maxMinHeight(int[] arr, int k, int w) {
        // code here
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            low=Math.min(low,arr[i]);
            high = Math.max(high,arr[i]+k);
        }
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            int reqQ=find(arr,mid,w);
            
            if(reqQ<=k)
                low = mid+1;
            else
                high = mid-1;
        }
        
        return high;
    }
    
    int find(int[] arr,int mid,int k){
        int n = arr.length;
        int[] water = new int[n+k+1];
        int prefix = 0;
        int used = 0;
        
        for(int i=0;i<n;i++){
            prefix+=water[i];
            int curr = prefix+arr[i];
            
            if(curr<mid){
                int req = mid-curr;
                
                water[i]+=req;
                prefix+=req;
                water[i+k]-=req;
                
                used+=req;
            }
        }
        
        return used;
    }
}
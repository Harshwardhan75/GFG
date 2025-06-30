class Solution {
    public int maxMinHeight(int[] arr, int k, int w) {
        // code here
        int low = 1,high = (int) 1e8;
        
        while(low<=high){
            int mid=(low+high)>>1;
            
            if(isPossible(arr,mid,k,w)){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return high;
    }
    
    static boolean isPossible(int[] arr,int mid,int k,int w){
        int n=arr.length;
        int[] water=new int[n+1];
        int used = 0, curr = 0;

        for(int i=0;i<n;i++){
            curr+=water[i];
            
            int height = arr[i]+curr;
            
            if(height<mid){
                int need=mid-height;
                used+=need;
                if(used>k)
                    return false;
                
                curr+=need;
                
                if(i+w<water.length)
                    water[i+w]-=need;
            }
        }
        
        return true;
    }
    
}
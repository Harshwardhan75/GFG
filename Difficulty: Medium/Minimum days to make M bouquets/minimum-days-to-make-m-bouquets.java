class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        int low = Arrays.stream(arr).min().orElse(0);
        int high= Arrays.stream(arr).max().orElse(0);
        int ans = -1;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(possible(arr,mid,k,m)){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        
        return ans;
    }
    
    boolean possible(int[] arr,int threshold,int k,int m){
        int count = 0;
        int n = arr.length;
        int total = 0;
        
        for(int i = 0;i<n;i++){
            if(arr[i]<=threshold){
                total++;
            }
            else{
                count += (total/k);
                total = 0;
            }
        }
        
        count+=total/k;
        
        // System.out.println(threshold+" "+count);
        
        return count>=m;
    }
}
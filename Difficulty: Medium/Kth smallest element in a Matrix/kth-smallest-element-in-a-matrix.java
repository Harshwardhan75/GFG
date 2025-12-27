class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int n = mat.length;
        
        for(int i=0;i<n;i++){
            min = Math.min(min,mat[i][0]);
            max = Math.max(max,mat[i][n-1]);
        }
        
        int low = min , high = max;
        
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            int count = find(mat,mid);
            
            if(count<k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return low;
    }
    
    int find(int[][] mat,int mid){
        int n = mat.length;
        int count = 0;
        
        for(int i=0;i<n;i++){
            int low = 0, high = n-1;
            
            while(low<=high){
                int mm = (low+high)>>1;
                
                if(mat[i][mm]<=mid)
                    low = mm + 1;
                else
                    high = mm - 1;
            }
            
            count += low;
        }
        
        return count;
    }
}

class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int low = 0 , high = n*m-1;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            int lr = low/m;
            int lc = low%m;
            
            int mr = mid/m;
            int mc = mid%m;
            
            int hr = high/m;
            int hc = high%m;
            
            if(mat[mr][mc]==x)
                return true;
            
            if(mat[lr][lc]<=mat[mr][mc]){
                if(mat[lr][lc]<=x && x<=mat[mr][mc])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else{
                if(mat[mr][mc]<=x && x<=mat[hr][hc])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        
        return false;
    }
}
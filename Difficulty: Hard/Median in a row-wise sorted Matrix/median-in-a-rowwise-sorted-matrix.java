class Solution {
    public int median(int[][] mat) {
        // code here
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0;i<n;i++){
            low = Math.min(low,mat[i][0]);
            high = Math.max(high,mat[i][m-1]);
        }
        int req = ((n*m)+1)/2;
        while(low<=high){
            int mid = (low+high)>>1;
            
            int val = findSmallerEqual(mat,mid);
            
            if(val<req)
                low = mid+1;
            else
                high = mid-1;
        }
        
        return low;
    }
    
    int findSmallerEqual(int[][] matrix,int value){
        int count = 0;
        int n = matrix.length;
        
        for(int i = 0;i<n;i++){
            count += upperBound(matrix[i],value);
        }
        
        return count;
    }
    
    int upperBound(int[] matrix,int value){
        int low = 0, high = matrix.length -1 ;
        
        while(low<=high){
            int mid = (low+high)>>1;
            if(matrix[mid]<=value)
                low = mid+1;
            else
                high = mid-1;
        }
        
        return low;
    }
}
class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        // code here
        int low = 0 , high = mat[0].length-1;
        
        while(low<=high){
            int mid = (low+high)>>1;
            int max = Integer.MIN_VALUE;
            int index = -1;
            
            for(int i=0;i<mat.length;i++){
                if(mat[i][mid]>max){
                    max = mat[i][mid];
                    index = i;
                }
            }
            int left = mid-1>=0?mat[index][mid-1]:Integer.MIN_VALUE;
            int right = mid+1<mat[0].length?mat[index][mid+1]:Integer.MIN_VALUE;
            
            
            if(left<=max && max>=right)
                return new ArrayList<>(Arrays.asList(index,mid));
            
            if(left>max)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return new ArrayList<>();
    }
}
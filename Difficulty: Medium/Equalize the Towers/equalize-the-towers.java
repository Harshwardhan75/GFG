class Solution {
    public int minCost(int[] heights, int[] cost) {
        // code here
        int low=1;
        int high = Arrays.stream(heights).max().orElseThrow();
        int max = high;
        
        while(low<=high){
            int mid=(low+high)>>1;
            int left=mid-1;
            int right=mid+1;
            
            int value_mid=totalCost(heights,cost,mid,max);
            int value_left=totalCost(heights,cost,left,max);
            int value_right=totalCost(heights,cost,right,max);
            
            if(value_left>=value_mid && value_mid<value_right)
                return value_mid;
            
            if(value_left<value_right)
                high=mid-1;
            else
                low=mid+1;
        }
        
        return max+1;
    }
    
    int totalCost(int[] height,int[] cost,int currHeight,int max){
        if(currHeight<0 || currHeight>max)
            return Integer.MAX_VALUE;
        
        int n=height.length;
        
        int totalCost=0;
        
        for(int i=0;i<n;i++){
            int diff=Math.abs(height[i]-currHeight);
            totalCost+=(diff*cost[i]);
        }
        
        return totalCost;
    }
}

class Solution {
    int[][] arr;
    Integer[] dp;
    public int maxProfit(int[][] jobs) {
        // code here
        Arrays.sort(jobs,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        this.arr = jobs;
        this.dp = new Integer[arr.length];
        return solve(0);
    }
    
    int solve(int index){
        if(index>=arr.length)
            return 0;
        
        if(dp[index]!=null)
            return dp[index];
        
        int nottake = solve(index+1);
        int take = arr[index][2] + solve(findBestIndex(index,arr.length-1));
        
        return dp[index] = Math.max(take,nottake);
    }
    
    int findBestIndex(int low,int high){
        int end = arr[low][1];
        low ++;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(arr[mid][0]<end){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return low;
    }
}

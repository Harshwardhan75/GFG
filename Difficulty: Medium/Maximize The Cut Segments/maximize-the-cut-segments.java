// User function Template for Java

class Solution {
    int[][] dp;
    // Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z) {
        // Your code here
        dp=new int[10001][3];
        int[] arr=new int[]{x,y,z};
        for(int[] i: dp)
            Arrays.fill(i,-1);
            
        return Math.max(0,solve(n,arr,2));
    }
    
    int solve(int segment,int[] arr,int index){
        if(segment==0)
            return 0;
        
        if(segment<0)
            return -100000000;
        
        if(index<0){
            return -100000000;
        }
        
        if(dp[segment][index]!=-1)
            return dp[segment][index];
        
        int nottake = solve(segment,arr,index-1);
        int take = -1000000;
        
        if(arr[index]<=segment)
            take = 1+solve(segment-arr[index],arr,index);
        
        return dp[segment][index] = Math.max(take,nottake);
    }
}

class Solution {
    int[][] dp;
    public int derangeCount(int n) {
        // code here
        if(n==1)
            return 0;
        dp = new int[n+1][1<<13];
        
        for(int[] i: dp)
            Arrays.fill(i,-1);
            
        return solve(n,1,0);
    }
    
    int solve(int n,int index,int visited){
        if(index>n)
            return 1;
        if(dp[index][visited]!=-1)
            return dp[index][visited];
            
        int count = 0;
        for(int i=1;i<=n;i++){
            if(index!=i && (visited & (1<<i))==0){
                count += solve(n,index+1,visited | (1<<i));
            }
        }
        
        return dp[index][visited] = count;
    }
};
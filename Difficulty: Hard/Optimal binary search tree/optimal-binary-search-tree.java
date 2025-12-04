class Solution {
    int[] keys,freq;
    int[][][] dp;
    public int minCost(int keys[], int freq[]) {
        // code here
        this.keys = keys;
        this.freq = freq;
        dp = new int[keys.length][keys.length][keys.length+2];
        // for(int[][] i: dp)  for(int[] j: i) Arrays.fill(j,-1);
        // return solve(0,keys.length-1,1);
        
        int n = keys.length;
        
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++)
                dp[i][i][j] = freq[i] * j;
        }
        
        for(int start = n-1;start>=0;start--){
            for(int end = start;end<n;end++){
                for(int level = n;level>=1;level--){
                    if(start==end){
                        dp[start][end][level] = freq[start] * level;
                    }
                    else{
                        int min = Integer.MAX_VALUE;
                        for(int i=start;i<=end;i++){
                            min = Math.min(min,
                                freq[i] * level 
                                    + (i-1>=0?dp[start][i-1][level+1]:0)
                                    + (i+1<n?dp[i+1][end][level+1]:0)
                            );
                        }
                        
                        dp[start][end][level] = min;
                    }
                }    
            }
        }
        
        return dp[0][n-1][1];
    }
    
    int solve(int start,int end,int level){
        if(start>end)
            return 0;
            
        if(dp[start][end][level]!=-1)
            return dp[start][end][level];
        
        if(start==end){
            return dp[start][end][level] = level * freq[start];
        }
        
        
        int min = Integer.MAX_VALUE;
        
        for(int i=start;i<=end;i++){
            min = Math.min(min,
                freq[i] * level + solve(start,i-1,level+1) + 
                                solve(i+1,end,level+1)
                );
        }
        
        return dp[start][end][level] = min;
    }
    
}

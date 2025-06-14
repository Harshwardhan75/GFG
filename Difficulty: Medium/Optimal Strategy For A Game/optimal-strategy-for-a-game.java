
class Solution {
    public int maximumAmount(int arr[]) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][n];
        // for(int[][] i: dp)  for(int[] j: i)    Arrays.fill(j,-1);
        
        for(int start=n-1;start>=0;start--){
            for(int end=start;end<n;end++){
                int i=start,j=end;
                // for(int turn = 0;turn<=1;turn++){
                //     if(turn==0){
                //         int first=arr[start]+(start+1>=n?0:dp[start+1][end][1]);  
                //         int second=arr[end]+(end-1<0?0:dp[start][end-1][1]);    
                        
                //         dp[start][end][turn] = Math.max(first,second);
                //     }
                //     else{
                //         // Opponent's turn: they will play optimally to minimize your final score
                //         // So we consider the minimum of the two possible outcomes 
                //         //they can leave you with
                //         // Note: We do not subtract the opponent's score, 
                //         //because we're only tracking your maximum possible score
                        
                //         int first=(start+1>=n?0:dp[start+1][end][0]);  
                //         int second=(end-1<0?0:dp[start][end-1][0]);     
                        
                //         dp[start][end][turn] = Math.min(first,second);
                        
                //     }
                // }
                
                if (i == j) {
                    dp[i][j] = arr[i];
                } else if (j == i + 1) {
                    dp[i][j] = Math.max(arr[i], arr[j]);
                } else {
                    int pickStart = arr[i] + Math.min(dp[i + 2][j], dp[i + 1][j - 1]);
                    int pickEnd = arr[j] + Math.min(dp[i][j - 2], dp[i + 1][j - 1]);
                    dp[i][j] = Math.max(pickStart, pickEnd);
                }

                
            }
        }
        
        return dp[0][n-1];
        // return solve(arr,0,n-1,0,dp);
    }
    
    // int solve(int[] arr,int start,int end,int turn,int[][][] dp){
    //     if(start>end)
    //         return 0;
            
    //     if(start==end)
    //     {
    //         return turn==0?arr[start]:0;
    //     }
        
    //     if(dp[start][end][turn]!=-1)
    //         return dp[start][end][turn];
        
    //     //your turn
    //     if(turn==0){
    //         int first=arr[start]+solve(arr,start+1,end,1,dp);    
    //         int second=arr[end]+solve(arr,start,end-1,1,dp);    
            
    //         return dp[start][end][turn] = Math.max(first,second);
    //     }
    //     else{
    //         // Opponent's turn: they will play optimally to minimize your final score
    //         // So we consider the minimum of the two possible outcomes 
    //         //they can leave you with
    //         // Note: We do not subtract the opponent's score, 
    //         //because we're only tracking your maximum possible score
            
    //         int first=solve(arr,start+1,end,0,dp);    
    //         int second=solve(arr,start,end-1,0,dp);    
            
    //         return dp[start][end][turn] = Math.min(first,second);
            
    //     }
    // }
}

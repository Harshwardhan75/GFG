class Solution {
    int n, m;
    int[][] cost;
    int minCost(int[][] costs) {
        // code here
        this.cost = costs;
        n = cost.length;
        m = cost[0].length;
        int[][] dp = new int[n][m];
        // for(int[] i: dp)    Arrays.fill(i,-1);
        // int val = solve(n-1,m,dp);
        // return val>=1_000_000_000?-1:val;
        
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        
        for(int i=0;i<m;i++)
            tmap.compute(cost[0][i],(k,v)->v==null?1:v+1);
            
        boolean flag = true;
        
        for(int i=0;i<m;i++){
            dp[0][i] = cost[0][i];
        }
        
        if(!flag)   return -1;
        
        for(int i=1;i<n;i++){
            TreeMap<Integer,Integer> temp = new TreeMap<>();
            for(int j=0;j<m;j++){
                subtract(tmap,dp[i-1][j]);
                if(tmap.isEmpty()){
                    flag = false;
                    break;
                }
                int newCost = cost[i][j] + tmap.firstKey();
                add(tmap,dp[i-1][j]);
                
                dp[i][j] = newCost;
                temp.compute(newCost,(k,v)->v==null?1:v+1);
            }
            if(!flag)
                return -1;
            tmap = temp;
        }
        
        if(!flag)
            return -1;
        
        int min = Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
            min = Math.min(min,dp[n-1][i]);
        
        return min;
    }
    
    private void subtract(TreeMap<Integer,Integer> tmap, int val){
        tmap.put(val,tmap.get(val)-1);
        if(tmap.get(val)==0)    tmap.remove(val);
    }
    
    private void add(TreeMap<Integer,Integer> tmap, int val){
        tmap.compute(val,(k,v)->v==null?1:v+1);
    }
    
    // int solve(int row,int k,int[][] dp){
    //     if(row == 0){
    //         int min = 1_000_000_000;
    //         for(int i=0;i<m;i++){
    //             if(i!=k)
    //                 min = Math.min(min,cost[0][i]);
    //         }
            
    //         return min;
    //     }
        
    //     if(dp[row][k]!=-1)
    //         return dp[row][k];
        
    //     int min = 1_000_000_000;
    //     for(int i=0;i<m;i++){
    //         if(i!=k)
    //             min = Math.min(min,cost[row][i] + solve(row-1,i,dp));
    //     }
            
    //     return dp[row][k] = min;
    // }
}
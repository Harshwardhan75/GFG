class Solution {
    
    // int[][][] dir=new int[][][]{
    //   {{-1,0}},//0
    //   {{1,0},{0,1}},//1
    //   {{1,0},{0,-1},{0,1}},//2
    //   {{1,0},{0,-1}},//3
    //   {{-1,0},{1,0},{0,1}},//4
    //   {{-1,0},{1,0},{0,-1},{0,1}},//5
    //   {{-1,0},{1,0},{0,-1}},//6
    //   {{-1,0},{0,1}},//7
    //   {{-1,0},{1,0},{0,-1},{0,1}},//8
    //   {{-1,0},{0,-1}}//9
    // };
    
    int[][] dir=new int[][]{
        {0,8},//0
        {1,2,4},//1
        {2,1,5,3},//2
        {3,2,6},//3
        {4,1,5,7},//4
        {5,2,4,6,8},//5
        {6,3,5,9},//6
        {7,4,8},//7
        {8,5,7,9,0},//8
        {9,6,8},//9
    };
    
    public int getCount(int n) {
        // code here
        int count = 0;
        int[][] dp=new int[10][n];
        
        for(int[] i: dp)
            Arrays.fill(i,-1);
            
        for(int i=0;i<=9;i++){
            count+=solve(i,n-1,dp);
        }
        
        return count;
    }
    
    int solve(int node,int n,int[][] dp){
        if(n<=0)
            return 1;
            
        if(dp[node][n]!=-1)
            return dp[node][n];
            
        int count = 0;
        
        for(int i: dir[node]){
            count+=solve(i,n-1,dp);
        }
        
        return dp[node][n] = count;
    }
}
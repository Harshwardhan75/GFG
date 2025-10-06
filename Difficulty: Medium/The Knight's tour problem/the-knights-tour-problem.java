class Solution {
    int[][] dir = new int[][]{{2,1},{1,2},{-2,1},{1,-2},{2,-1},{-1,2},{-2,-1},{-1,-2}};
    int[][] grid;
    int n;
    
    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        // code here
        grid = new int[n][n];
        for(int[] i: grid)  Arrays.fill(i,-1);
        this.n = n;
        boolean status = solve(0,0,0);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        if(!status)
            return result;    
        
        for(int[] i: grid){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int x: i)   arr.add(x);
            result.add(arr);
        }
        
        return result;
    }
    
    private boolean solve(int r,int c,int value){
        grid[r][c] = value;
        
        if(value == (n*n)-1){
            return true;
        }
        
        for(int[] d: dir){
            int nexti = r+d[0];
            int nextj = c+d[1];
            
            if(nexti>=0 && nexti<n && nextj>=0 && nextj<n && grid[nexti][nextj]==-1){
                if(solve(nexti,nextj,value+1))
                    return true;
            }
        }
        
        grid[r][c] = -1;
        return false;
    }
}
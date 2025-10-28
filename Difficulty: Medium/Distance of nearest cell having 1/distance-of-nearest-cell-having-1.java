class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        // code here
        Queue<int[]> que = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1)
                    que.offer(new int[]{i,j});
            }
        }
        
        while(!que.isEmpty()){
            int r = que.peek()[0];
            int c = que.peek()[1];
            que.poll();
            
            for(int[] d: new int[][]{{1,0},{0,1},{-1,0},{0,-1}}){
                int nexti = r+d[0];
                int nextj = c+d[1];
                
                if(nexti>=0 && nexti<n && nextj>=0 && nextj<m && grid[nexti][nextj]==0){
                    grid[nexti][nextj] = grid[r][c] + 1;
                    que.offer(new int[]{nexti,nextj});
                }
            }
        }
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for(int[] i: grid){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j: i)   arr.add(j-1);
            result.add(arr);
        }
        
        return result;
    }
}
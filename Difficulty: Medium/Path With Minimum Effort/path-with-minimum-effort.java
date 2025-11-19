class Solution {
    public int minCostPath(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[][] dist = new int[n][m];
        
        for(int[] i: dist)  
            Arrays.fill(i,1_000_000_000);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
        dist[0][0] = 0;
        pq.offer(new int[]{0,0,0});
        
        while(!pq.isEmpty()){
            int[] node = pq.poll();
            
            if(node[0]==n-1 && node[1]==m-1)
                return dist[n-1][m-1];
            
            for(int[] d: new int[][]{{1,0},{0,1},{-1,0},{0,-1}}){
                int nexti = d[0] + node[0];
                int nextj = d[1] + node[1];
                
                if(nexti>=0 && nexti<n && nextj>=0 && nextj<m){
                    int newE = Math.max(node[2],Math.abs(mat[nexti][nextj] - mat[node[0]][node[1]]));
                    
                    if(newE<dist[nexti][nextj]){
                        dist[nexti][nextj] = newE;
                        pq.offer(new int[]{nexti,nextj,newE});
                    }
                }
            }
        }
        
        return 0;
    }
}

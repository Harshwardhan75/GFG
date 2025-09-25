// User function Template for Java

class Solution {
    static int shotestPath(int[][] mat, int n, int m, int k) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[3]-b[3]);
        int[][][] dist = new int[n][m][k+1];
        for(int[][] i: dist)  
            for(int[] j: i)
                Arrays.fill(j,Integer.MAX_VALUE);
        
        pq.offer(new int[]{0,0,k,0});
        dist[0][0][k] = 0;
        
        while(!pq.isEmpty()){
            int[] node = pq.poll();
            
            if(node[0] == n-1 && node[1] == m-1)
                return node[3];
            
            for(int[] d: new int[][]{{1,0},{0,1},{-1,0},{0,-1}}){
                int nexti = d[0] + node[0];
                int nextj = d[1] + node[1];
                
                if(nexti>=0 && nexti<n && nextj>=0 && nextj<m){
                    int newDist = node[3]+1;
                    int newK = (mat[nexti][nextj] == 1)?node[2]-1:node[2];
                    
                    if(newK>=0 && newDist<dist[nexti][nextj][newK]){
                        dist[nexti][nextj][newK] = newDist;
                        pq.offer(new int[]{nexti,nextj,newK,newDist});
                    }
                }
            }
        }
        
        return -1;
    }
};
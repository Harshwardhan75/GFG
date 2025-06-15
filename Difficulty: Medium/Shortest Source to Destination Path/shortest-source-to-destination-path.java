// User function Template for Java

class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        if(A[0][0]==0 || A[X][Y]==0)
            return -1;
        
        
        Queue<int[]> que=new LinkedList<>();
        int[][] dist=new int[N][M];
        for(int[] d: dist)  Arrays.fill(d,(int)1e8);
        
        que.offer(new int[]{0,0});
        dist[0][0]=0;
        
        while(!que.isEmpty()){
            int r=que.peek()[0];
            int c=que.peek()[1];
            que.poll();
            
            if(r==X && c==Y)
                return dist[X][Y];
            
            for(int[] d: new int[][]{{1,0},{0,1},{-1,0},{0,-1}}){
                int nexti=r+d[0];
                int nextj=c+d[1];
                
                if(nexti>=0 && nexti<N && nextj>=0 && nextj<M && A[nexti][nextj]==1){
                    if(dist[r][c]+1<dist[nexti][nextj]){
                        dist[nexti][nextj]=dist[r][c]+1;
                        que.offer(new int[]{nexti,nextj});
                    }
                }
            }
        }
        
        return -1;
    }
};
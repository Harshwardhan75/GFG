//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(mat);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int orangesRotting(int[][] mat) {
        // Code here
        int n=mat.length;
        int m=mat[0].length;
        boolean[][] visited=new boolean[n][m];
        int count = 0;
        Queue<int[]> que=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==2){
                    que.offer(new int[]{i,j,0});
                    visited[i][j]=true;
                }
                else{
                    if(mat[i][j]==0)
                        visited[i][j]=true;
                    else
                        count++;
                }
            }
        }
        
        int maxtime = 0;
        while(!que.isEmpty()){
            int r=que.peek()[0];
            int c=que.peek()[1];
            int time = que.peek()[2];
            que.poll();
            maxtime=Math.max(maxtime,time);
            
            for(int[] d: new int[][]{{1,0},{0,1},{-1,0},{0,-1}}){
                int nexti=d[0]+r;
                int nextj=d[1]+c;
                
                if(nexti>=0 && nexti<n && nextj>=0 && nextj<m && !visited[nexti][nextj]){
                    visited[nexti][nextj]=true;
                    count--;
                    que.offer(new int[]{nexti,nextj,time+1});
                }
            }
        }
        
        return count==0?maxtime:-1;
    }
}
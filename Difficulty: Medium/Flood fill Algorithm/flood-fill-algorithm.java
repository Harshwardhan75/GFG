//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            int[][] image = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S2 = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) image[i][j] = Integer.parseInt(S2[j]);
            }
            int sr = Integer.parseInt(br.readLine().trim());
            int sc = Integer.parseInt(br.readLine().trim());
            int newColor = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int oldColor=image[sr][sc];
        if(oldColor==newColor)
            return image;
        int n=image.length;
        int m=image[0].length;
        Queue<int[]> que=new LinkedList<>();
        que.offer(new int[]{sr,sc});
        image[sr][sc]=newColor;
        while(!que.isEmpty()){
            int r=que.peek()[0];
            int c=que.peek()[1];
            que.poll();
            
            for(int[] d: new int[][]{{1,0},{0,1},{-1,0},{0,-1}}){
                int nexti=r+d[0];
                int nextj=c+d[1];
                
                if(nexti>=0 && nexti<n && nextj>=0 && nextj<m && image[nexti][nextj]==oldColor){
                    image[nexti][nextj]=newColor;
                    que.offer(new int[]{nexti,nextj});
                }
            }
        }
        
        return image;
    }
    
    void DFS(int[][] image,int r,int c,int oldC,int newC){
        int n=image.length;
        int m=image[0].length;
        image[r][c]=newC;
        
        for(int[] d: new int[][]{{1,0},{0,1},{-1,0},{0,-1}}){
            int nexti=r+d[0];
            int nextj=c+d[1];
            
            if(nexti>=0 && nexti<n && nextj>=0 && nextj<m && image[nexti][nextj]==oldC){
                DFS(image,nexti,nextj,oldC,newC);
            }
        }
    }
}
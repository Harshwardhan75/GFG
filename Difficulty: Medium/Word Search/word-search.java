//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] mat = new char[n][m];

            // Reading the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.next().charAt(0);
                }
            }

            String word = sc.next();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(mat, word);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends




class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int n=mat.length;
        int m=mat[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(possible(mat,i,j,word,0+1,visited))
                        return true;
                }
            }
        }
        
        return false;
    }
    
    static public boolean possible(char[][] mat,int r,int c,String word,int index,boolean[][] visited){
        if(index==word.length())    return true;
    
        int n=mat.length;
        int m=mat[0].length;
        visited[r][c]=true;
        
        for(int[] i: new int[][]{{1,0},{0,1},{-1,0},{0,-1}}){
            int nexti=r+i[0];
            int nextj=c+i[1];
            
            if(nexti>=0 && nexti<n && nextj>=0 && nextj<m && !visited[nexti][nextj] && mat[nexti][nextj]==word.charAt(index)){
                if(possible(mat,nexti,nextj,word,index+1,visited))
                    return true;
            }
        }
        visited[r][c]=false;
        return false;
    }
}
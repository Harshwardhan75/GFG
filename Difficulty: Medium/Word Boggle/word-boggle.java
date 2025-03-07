//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            String[] dictionary = new String[N];
            for(int i=0;i<N;i++)
            {
                dictionary[i] = sc.next();
            }
            
            int R = Integer.parseInt(sc.next());
            int C = Integer.parseInt(sc.next());
            
            char board[][] = new char[R][C];
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                    board[i][j] = sc.next().charAt(0);
                }
            }
            
            Solution obj = new Solution();
            String[] ans = obj.wordBoggle(board, dictionary);
            
            if(ans.length == 0) System.out.println("-1");
            else
            {
                Arrays.sort(ans);
                for(int i=0;i<ans.length;i++)
                {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
            
            t--;
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        // Write your code here
        Set<String> set=new HashSet<>();
        for(String s: dictionary)   set.add(s);
        
        return find(board,set);
    }
    
    String[] find(char[][] board,Set<String> set){
        int n=board.length;
        int m=board[0].length;
        boolean[][] visited=new boolean[n][m];
        Set<String> arr=new HashSet<>();
        
        for(String s: set){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(s.charAt(0)==board[i][j]){
                        if(DFS(board,s,1,i,j,visited))
                            arr.add(s);
                    }
                }
            }    
        }
        String[] result=new String[arr.size()];
        int i=0;
        for(String s: arr)
            result[i++]=s;
        return result;
    }
    
    boolean DFS(char[][] board,String s,int index,int r,int c,boolean[][] visited){
        int n=board.length;
        int m=board[0].length;
        
        if(index==s.length())    return true;
        visited[r][c]=true;
        int[][] dir=new int[][]{{0,1},{1,0},{0,-1},{-1,0}
        ,{1,-1},{-1,1},{-1,-1},{1,1}};
        
        for(int[] d: dir){
            int nexti=r+d[0];
            int nextj=c+d[1];
            if(nexti>=0 && nexti<n && nextj>=0 && nextj<m 
            && !visited[nexti][nextj] && board[nexti][nextj]==s.charAt(index)){
                if(DFS(board,s,index+1,nexti,nextj,visited)){
                    visited[r][c]=false;
                    return true;
                }
            }
        }
        
        return visited[r][c]=false;
    }
}
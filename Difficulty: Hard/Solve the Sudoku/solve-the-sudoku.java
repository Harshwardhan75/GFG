//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = 9;
            int matrix[][] = new int[n][n];
            // String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ob.solveSudoku(matrix);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) System.out.print(matrix[i][j] + " ");
                System.out.println();
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] mat) {
        // code here
        solve(mat);
    }
    
    static boolean solve(int[][] mat){
        int n=mat.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    for(int x=1;x<=9;x++){
                        if(possible(mat,i,j,x))
                        {
                            mat[i][j]=x;
                            if(solve(mat))
                                return true;
                            mat[i][j]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    static boolean possible(int[][] mat,int r,int c,int val){
        int n=mat.length;
        for(int i=0;i<n;i++){
            if(mat[i][c]==val || mat[r][i]==val)
                return false;
        }
        
        int row=r/3;
        int col=c/3;
        
        row*=3;
        col*=3;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(mat[row+i][col+j]==val)
                    return false;
            }
        }
        
        return true;
    }
}
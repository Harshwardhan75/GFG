//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if (ans.size() == 0)
                System.out.println("-1");
            else {
                ans.sort((list1, list2) -> {
                    int size = Math.min(list1.size(), list2.size());
                    for (int i = 0; i < size; i++) {
                        if (!list1.get(i).equals(list2.get(i))) {
                            return list1.get(i) - list2.get(i);
                        }
                    }
                    return list1.size() - list2.size();
                });

                for (int i = 0; i < ans.size(); i++) {
                    System.out.print("[");
                    for (int j = 0; j < ans.get(i).size(); j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        boolean[][] board=new boolean[n][n];
        boolean[] left=new boolean[2*n-1];
        boolean[] right=new boolean[2*n-1];
        boolean[] column=new boolean[n];
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        solve(board,0,column,left,right,result);
        
        return result;
    }
    
    public void solve(boolean[][] board,int tqps,boolean[] column,
    boolean[] left,boolean[] right,ArrayList<ArrayList<Integer>> result){
        int n=board.length;
        if(tqps==n){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(board[j][i])
                        arr.add(j+1);
                }
            }
            result.add(arr);
            return ;
        }
        
        for(int i=0;i<n;i++){
            if(!column[i] && !left[tqps+i] && !right[i - tqps + (n - 1)])
            {
                board[tqps][i]=true;
                column[i]=true;
                left[tqps+i]=true;
                right[i - tqps + (n - 1)]=true;
                solve(board,tqps+1,column,left,right,result);
                board[tqps][i]=false;
                column[i]=false;
                left[tqps+i]=false;
                right[i - tqps + (n - 1)]=false;
            }
        }
    }
}
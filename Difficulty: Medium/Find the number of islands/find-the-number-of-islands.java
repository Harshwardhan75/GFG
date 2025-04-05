//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] grid = new char[n][m];

            // Read the grid input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.next().charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.countIslands(grid);
            System.out.println(ans);
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
    class DisjointSet {
        int[] size;
        int[] parent;

        DisjointSet(int n) {
            size = new int[n];
            parent = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        int findUltimateParent(int node) {
            if (node == parent[node])
                return node;

            return parent[node] = findUltimateParent(parent[node]);
        }

        void unionBySize(int u, int v) {
            int upu = findUltimateParent(u);
            int upv = findUltimateParent(v);

            if (upu == upv)
                return;

            if (size[upu] < size[upv]) {
                parent[upu] = upv;
                size[upv] += size[upu];
            } else {
                parent[upv] = upu;
                size[upu] += size[upv];
            }
        }
    }
    public int countIslands(char[][] grid) {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        DisjointSet ds=new DisjointSet(n*m);
        Set<Integer> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='W')
                    continue;
                    
                int current = (i*m)+j;
                for(int[] d: new int[][]{{1,0},{0,1},{-1,0},{0,-1},{1,-1},{-1,1},{1,1},{-1,-1}}){
                    int nexti=i+d[0];
                    int nextj=j+d[1];
                    
                    if(nexti>=0 && nexti<n && nextj>=0 && nextj<m && grid[nexti][nextj]=='L'){
                        int upu=ds.findUltimateParent(current);
                        int next = (nexti*m)+nextj;
                        int upv=ds.findUltimateParent(next);
                        
                        if(upu!=upv)
                            ds.unionBySize(current,next);
                    }
                }
                
            }
        }
        
        for(int i=0;i<n;i++)    
            for(int j=0;j<m;j++) 
                if(grid[i][j]=='L')
                    set.add(ds.findUltimateParent(i*m+j));

        
        return set.size();
    }
}
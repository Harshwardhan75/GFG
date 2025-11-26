// User function Template for Java

class Solution {
    class DSU{
        int[] parent;
        DSU(int n){
            parent = new int[n];
            Arrays.setAll(parent,(index)-> index);
        }
        
        int find(int node){
            if(node == parent[node])
                return node;
            
            return parent[node] = find(parent[node]);
        }
        
        void union(int u,int v){
            int upu = find(u);
            int upv = find(v);
            
            parent[upv] = upu;
        }
    }
    
    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        // Your code here
        int[][] matrix = new int[rows][cols];
        int size = rows*cols;
        
        DSU ds = new DSU(size);
        int count = 0;
        List<Integer> result = new ArrayList<>();
        
        for(int[] q: operators){
            int r = q[0], c = q[1];
            
            if(matrix[r][c] == 1)
            {
                result.add(count);
                continue;
            }
            
            matrix[r][c] =1;
            count ++;
            
            for(int[] d: new int[][]{{1,0},{0,1},{-1,0},{0,-1}}){
                int nexti = r+d[0];
                int nextj = c+d[1];
                
                if(nexti>=0 && nexti<rows && nextj>=0 && nextj<cols && 
                    matrix[nexti][nextj]==1){
                        int curr = r * cols + c;
                        int next = nexti * cols + nextj;
                        
                        if(ds.find(curr)!=ds.find(next)){
                            ds.union(curr,next);
                            count --;
                        }
                }
            }
            
            result.add(count);
        }
        
        return result;
    }
}
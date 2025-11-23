class Solution {
    class DSU{
        int[] parent;
        int[] size;
        
        DSU(int n){
            parent = new int[n];
            size = new int[n];
            Arrays.setAll(parent,index -> index);
            Arrays.fill(size,1);
        }
        
        int find(int node){
            if(node == parent[node])
                return node;
            
            return parent[node] = find(parent[node]);
        }
        
        void union(int u,int v){
            int upu = find(u);
            int upv = find(v);
            
            if(upu==upv)
                return;
            
            if(size[upu]<size[upv])
            {
                parent[upu] = upv;
                size[upv] += size[upu];
            }
            else{
                parent[upv] = upu;
                size[upu] += size[upv];
            }
        }
        
        int getComponents(){
            int count = 0;
            for(int i=0;i<parent.length;i++)
                if(parent[i]==i && size[i]>1)
                    count ++;
            return count;
        }
    }
    
    int maxRemove(int[][] stones) {
        // Code here
        int maxrow = -1, maxcol = -1;
        for(int[] i: stones){
            maxrow = Math.max(maxrow,i[0]);
            maxcol = Math.max(maxcol,i[1]);
        }
        maxrow ++;
        maxcol ++;
        DSU ds = new DSU(maxrow+maxcol);
        
        for(int[] i: stones){
            int r = i[0], c = i[1];
            
            int nr = r;
            int nc = maxrow + c;
            
            ds.union(nr,nc);
        }
        
        return stones.length - ds.getComponents();
    }
};

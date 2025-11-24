class Solution {
    
    class DSU{
        int[] parent;
        
        DSU(int n){
            parent = new int[n];
            Arrays.setAll(parent,index->index);
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
        
        int getComponentCount(){
            int count = 0;
            for(int i=0;i<parent.length;i++)
                if(parent[i]==i)
                    count++;
                
            return count;
        }
    }
    
    public int secondMST(int V, int[][] edges) {
        // code here
        Arrays.sort(edges,(a,b)->a[2]-b[2]);
        DSU ds = new DSU(V);
        
        ArrayList<int[]> minST = new ArrayList<>();
        int W = 0;
        
        for(int[] e: edges){
            int u = e[0], v = e[1];
            
            int upu = ds.find(u);
            int upv = ds.find(v);
            
            if(upu!=upv){
                minST.add(e);
                W += e[2];
                ds.union(upu,upv);
            }
        }
        
        int min = Integer.MAX_VALUE;
        
        // for(int[] e: edges){
        //     System.out.println(Arrays.toString(e));
        // }
        
        for(int[] e: minST){
            min = Math.min(min,find(V,edges,e,W));
        }
        
        return min==Integer.MAX_VALUE?-1:min;
    }
    
    int find(int V,int[][] edges,int[] ee,int W){
        DSU ds = new DSU(V);
        int weight = 0;
        
        for(int[] e: edges){
            if(e[0]==ee[0] && e[1]==ee[1] && e[2]==ee[2])   continue;
            
            int u = e[0], v = e[1];
            
            int upu = ds.find(u);
            int upv = ds.find(v);
            
            if(upu!=upv){
                weight+=e[2];
                ds.union(upu,upv);
            }
        }
        
        if(ds.getComponentCount()>1 || W==weight)
            return Integer.MAX_VALUE;
        
        return weight;
    }
}
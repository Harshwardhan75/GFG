

class Solution {

    class DSU{
        int[] parent;
        
        public DSU(int n){
            parent = new int[n];
            Arrays.setAll(parent,i->i);
        }
        
        int find(int node){
            if(node==parent[node])
                return node;
            
            return parent[node] = find(parent[node]);
        }
        
        void union(int u,int v){
            int upu = find(u);
            int upv = find(v);
            
            parent[upv] = upu;
        }
    }

    public int minCost(int[][] houses) {
        // code here
        int n = houses.length;  
        
        ArrayList<int[]> graph = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                graph.add(new int[]{i,j,Math.abs(houses[i][0]-houses[j][0])
                    + Math.abs(houses[i][1]-houses[j][1])
                });
            }
        }
        
        DSU ds = new DSU(graph.size());
        Collections.sort(graph,(a,b)->a[2]-b[2]);
        int cost = 0;
        for(int[] i: graph){
            if(ds.find(i[0])!=ds.find(i[1])){
                ds.union(i[0],i[1]);
                cost += i[2];
            }
        }
        
        return cost;
    }
}

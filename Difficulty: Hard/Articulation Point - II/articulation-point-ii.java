

class Solution {
    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        // code here
        int[] tin=new int[V];
        int[] low=new int[V];
        Set<Integer> set=new HashSet<>();
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++)    graph[i]=new ArrayList<>();
        for(int[] e: edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        Arrays.fill(tin,-1);
        Arrays.fill(low,-1);
        boolean[] visited=new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                DFS(visited,set,graph,tin,low,i,-1,new int[]{0});
            }
        } 
        
        ArrayList<Integer> result=new ArrayList<>(set);
        if(result.isEmpty())
            result.add(-1);
        return result;
    }
    
    static void DFS(boolean[] visited,Set<Integer> set,ArrayList<Integer>[] graph,int[] tin,
    int[] low,int node,int parent,int[] time){
        tin[node]=low[node]=time[0];
        visited[node]=true;
        time[0]++;
        int child = 0;
        for(int adj: graph[node]){
            if(adj==parent) continue;
            
            if(!visited[adj]){
                DFS(visited,set,graph,tin,low,adj,node,time);
                low[node]=Math.min(low[node],low[adj]);
                
                if(tin[node]<=low[adj] && parent!=-1)
                    set.add(node);
                child++;
            }
            else{
                low[node]=Math.min(low[node],tin[adj]);
            }
        }
        
        if(child>1 && parent==-1)
            set.add(node);
    }
}
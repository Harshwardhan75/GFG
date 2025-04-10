//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[][] edge = new int[n][2];
            for (int i = 0; i < n; i++) {
                edge[i][0] = sc.nextInt();
                edge[i][1] = sc.nextInt();
            }
            Solution obj = new Solution();
            int res = obj.minCost(edge);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends




class Solution {
    
    static class DSU{
        int[] size;
        int[] parent;
        
        DSU(int n){
            this.parent=new int[n];
            this.size=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        
        int findParent(int node){
            if(parent[node]==node)
                return node;
            
            return parent[node]=findParent(parent[node]);
        }
        
        void unionBySize(int u,int v){
            int upu=findParent(u);
            int upv=findParent(v);
            
            if(upu==upv)
                return;
            
            if(size[upu]<size[upv]){
                parent[upu]=upv;
                size[upv]+=size[upu];
            }
            else{
                parent[upv]=upu;
                size[upu]+=size[upv];
            }
        }
    }

    public int minCost(int[][] houses) {
        // code here
        int n=houses.length;
        ArrayList<int[]> graph=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int u=i,v=j;
                int wt=Math.abs(houses[i][0]-houses[j][0])+Math.abs(houses[i][1]-houses[j][1]);
                graph.add(new int[]{u,v,wt});
            }
        }
        
        Collections.sort(graph,(a,b)->a[2]-b[2]);
        int sum = 0;
        DSU ds=new DSU(n);
        for(int[] e: graph){
            int u=e[0];
            int v=e[1];
            int wt=e[2];
            
            if(ds.findParent(u) != ds.findParent(v)){
                sum+=wt;
                ds.unionBySize(u,v);
            }
        }
        
        return sum;
    }
}

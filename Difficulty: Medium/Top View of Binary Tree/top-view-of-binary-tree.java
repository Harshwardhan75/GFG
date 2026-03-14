/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    TreeMap<Integer,Integer> tmap = new TreeMap<>();
    public ArrayList<Integer> topView(Node root) {
        // code here
        solve(root);
        
        return new ArrayList<>(tmap.values());
    }
    
    void solve(Node root){
        Queue<Pair> que = new LinkedList<>();
        que.offer(new Pair(root,0));
        
        while(!que.isEmpty()){
            Pair p = que.poll();
            
            if(!tmap.containsKey(p.line))
                tmap.put(p.line,p.node.data);
            
            if(p.node.left!=null)
                que.offer(new Pair(p.node.left,p.line-1));
                
            if(p.node.right!=null)
                que.offer(new Pair(p.node.right,p.line+1));
        }
    }
    
    class Pair{
        Node node;
        int line;
        
        public Pair(Node node,int line){
            this.node = node;
            this.line = line;
        }
    }
}
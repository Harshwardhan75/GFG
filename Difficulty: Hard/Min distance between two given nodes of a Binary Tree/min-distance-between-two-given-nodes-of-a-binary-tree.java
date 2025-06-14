// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    
    static class Pair {
        Node node;
        int level;
    
        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }
    
    Node findLCA(Node root,int a,int b){
        if(root==null)
            return root;
        
        if(root.data==a || root.data==b)
            return root;
        
        Node left=findLCA(root.left,a,b);
        Node right=findLCA(root.right,a,b);
        
        if(left!=null && right!=null)
            return root;
            
        return left!=null?left:right;
    }
    
    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca=findLCA(root,a,b);
        Queue<Pair> que=new LinkedList<>();
        
        que.offer(new Pair(root,0));
        int levelLCA=-1;
        int levelA=-1;
        int levelB=-1;
        
        while(!que.isEmpty()){
            Pair p=que.poll();
            if(p.node.data==lca.data)    levelLCA=p.level;
            if(p.node.data==a)    levelA=p.level;
            if(p.node.data==b)    levelB=p.level;
            
            if(p.node.left!=null)
                que.offer(new Pair(p.node.left,p.level+1));
                
            if(p.node.right!=null)
                que.offer(new Pair(p.node.right,p.level+1));
            
            if(levelLCA!=-1 && levelA!=-1 && levelB!=-1)
                break;
        }
        
        
        return levelA+levelB-2*levelLCA;
    }
}
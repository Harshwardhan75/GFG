/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    class Pair{
        Node node;
        int column;
        
        Pair(Node n,int c){
            node = n;
            column = c;
        }
    }
    
    TreeMap<Integer,Integer> tmap = new TreeMap<>();
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        Queue<Pair> que = new LinkedList<>();
        que.offer(new Pair(root,0));
        
        while(!que.isEmpty()){
            Pair p = que.poll();
            tmap.put(p.column,p.node.data);
            
            if(p.node.left!=null)
                que.offer(new Pair(p.node.left,p.column-1));
                
            if(p.node.right!=null)
                que.offer(new Pair(p.node.right,p.column+1));
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i: tmap.keySet())
            result.add(tmap.get(i));
        return result;
    }

    
}
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
    public int minTime(Node root, int target) {
        // code here
        
        // <child,parent>
        Map<Node,Node> parentMap = new HashMap<>();
        
        Node start = findTarget(root,target,parentMap);
        
        
        Queue<Node> que = new LinkedList<>();
        Set<Node> set = new HashSet<>();
        que.offer(start);
        set.add(start);
        int time = -1;
        
        while(!que.isEmpty()){
            int size = que.size();
            
            for(int i=1;i<=size;i++){
                Node node = que.poll();
                
                if(node.left!=null && !set.contains(node.left)){
                    set.add(node.left);
                    que.offer(node.left);
                }
                
                if(node.right!=null && !set.contains(node.right)){
                    set.add(node.right);
                    que.offer(node.right);
                }
                
                if(parentMap.containsKey(node) && !set.contains(parentMap.get(node))){
                    set.add(parentMap.get(node));
                    que.offer(parentMap.get(node));
                }
            }
            
            time++;
        }
        
        return time;
    }
    
    Node findTarget(Node root,int target,Map<Node,Node> parentMap){
        if(root==null)
            return root;
        
        if(root.left!=null)
            parentMap.put(root.left,root);
        if(root.right!=null)
            parentMap.put(root.right,root);
            
        Node left = findTarget(root.left,target,parentMap);
        Node right = findTarget(root.right,target,parentMap);
        
        if(root.data==target)
            return root;
            
        return left!=null?left:right;
    }
}
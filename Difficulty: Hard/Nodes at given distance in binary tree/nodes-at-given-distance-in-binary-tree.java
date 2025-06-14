// class Node
// {
//     int data;
//     Node left, right;
// }

class Solution {
    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        // return the sorted list of all nodes at k dist
        Map<Node,Node> parent=new HashMap<>();
        Queue<Node> que=new LinkedList<>();
        que.offer(root);
        Node targetNode=null;
        
        while(!que.isEmpty()){
            Node node=que.poll();
            if(node.data==target)
                targetNode=node;
                
            if(node.left!=null){
                parent.put(node.left,node);
                que.offer(node.left);
            }
            
            if(node.right!=null){
                parent.put(node.right,node);
                que.offer(node.right);
            }
        }
        
        que.clear();
        que.offer(targetNode);
        Set<Node> set=new HashSet<>();
        set.add(targetNode);
        
        int levelInQueue=0;
        
        ArrayList<Integer> result=new ArrayList<>();
        while(!que.isEmpty()){
            int size=que.size();
            
            for(int i=1;i<=size;i++){
                Node node=que.poll();
                if(levelInQueue==k)
                    result.add(node.data);
                
                //parent
                if(parent.containsKey(node) && !set.contains(parent.get(node))){
                    que.offer(parent.get(node));
                    set.add(parent.get(node));
                }
                
                if(node.left!=null && !set.contains(node.left)){
                    que.offer(node.left);
                    set.add(node.left);
                }
                
                if(node.right!=null && !set.contains(node.right)){
                    que.offer(node.right);
                    set.add(node.right);
                }
            }
            
            if(levelInQueue>=k)
                break;
            
            levelInQueue++;
        }
        result.sort((a,b)->a-b);
        return result;
    }
};
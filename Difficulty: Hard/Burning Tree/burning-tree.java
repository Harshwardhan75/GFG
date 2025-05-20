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
}  */
class Solution {
    
    static Node findNode(Node root,int target){
        if(root==null || root.data==target)
            return root;
        
        Node left = findNode(root.left,target);
        Node right = findNode(root.right,target);
        
        return left!=null?left:right;
    }
    
    public static int minTime(Node root, int target) {
        // code here
        Node t=findNode(root,target);
        
        Map<Node,Node> map=new HashMap<>();
        fillMap(map,root);
        
        Queue<Node> que=new LinkedList<>();
        int time = 0;
        Set<Node> set=new HashSet<>();
        que.offer(t);
        set.add(t);
        
        while(!que.isEmpty()){
            int size=que.size();
            
            for(int i=1;i<=size;i++){
                Node temp=que.poll();
                
                if(temp.left!=null && !set.contains(temp.left)){
                    set.add(temp.left);
                    que.offer(temp.left);
                }
                
                if(temp.right!=null && !set.contains(temp.right)){
                    set.add(temp.right);
                    que.offer(temp.right);
                }
                
                if(map.containsKey(temp) && !set.contains(map.get(temp))){
                    set.add(map.get(temp));
                    que.offer(map.get(temp));
                }
            }
            
            time++;
        }
        return time-1;
    }
    
    static void fillMap(Map<Node,Node> map,Node root){
        Queue<Node> que=new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty()){
            Node temp=que.poll();
            
            if(temp.left!=null){
                map.put(temp.left,temp);
                que.offer(temp.left);
            }
            
            if(temp.right!=null){
                map.put(temp.right,temp);
                que.offer(temp.right);
            }
        }
    }
}
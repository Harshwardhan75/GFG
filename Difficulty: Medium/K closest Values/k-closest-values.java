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

interface Solve{
    void solve(Node root);
}

class Solution {
    public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            int aa = Math.abs(a-target);
            int bb = Math.abs(b-target);
            
            if(aa==bb)
                return b-a;
            
            return bb-aa;
        });
        
        Solve[] ans = new Solve[1];
        
        ans[0] = (Node node)->{
            if(node==null)
                return;
            
            pq.offer(node.data);
            if(pq.size()>k)
                pq.poll();
            ans[0].solve(node.left);
            ans[0].solve(node.right);
        };
        
        ans[0].solve(root);
        
        return new ArrayList<>(pq);
    }
}
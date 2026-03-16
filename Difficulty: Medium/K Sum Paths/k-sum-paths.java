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
    public int countAllPaths(Node root, int k) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        return solve(root,map,k,0);
    }
    
    int solve(Node root,Map<Integer,Integer> map,int k,int sum){
        if(root==null)
            return 0;
        
        sum += root.data;
        
        int count = map.getOrDefault(sum - k,0);
        
        map.put(sum,map.getOrDefault(sum,0)+1);
        
        count += solve(root.left,map,k,sum);
        count += solve(root.right,map,k,sum);
        
        map.put(sum,map.get(sum)-1);
        return count;
        
    }
}
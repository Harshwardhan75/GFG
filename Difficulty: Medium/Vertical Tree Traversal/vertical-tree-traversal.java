/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    static class Pair{
        Node node;
        int vlevel;
        int hlevel;
        
        Pair(Node node,int v,int h){
            this.node=node;
            this.vlevel=v;
            this.hlevel=h;
        }
    }
    static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // add your code here
        Queue<Pair> que=new LinkedList<>();
        que.offer(new Pair(root,0,0));
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> tmap=new TreeMap<>();
        
        while(!que.isEmpty()){
            Pair p=que.poll();
            TreeMap<Integer,ArrayList<Integer>> hmap=tmap.getOrDefault(p.vlevel,new TreeMap<>());
            ArrayList<Integer> arr=hmap.getOrDefault(p.hlevel,new ArrayList<>());
            arr.add(p.node.data);
            hmap.put(p.hlevel,arr);
            tmap.put(p.vlevel,hmap);
            
            if(p.node.left!=null){
                que.offer(new Pair(p.node.left,p.vlevel-1,p.hlevel+1));
            }
            
            if(p.node.right!=null){
                que.offer(new Pair(p.node.right,p.vlevel+1,p.hlevel+1));
            }
        }
        
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        for(int i: tmap.keySet()){
            TreeMap<Integer,ArrayList<Integer>> map=tmap.get(i);
            ArrayList<Integer> arr=new ArrayList<>();
            
            for(int j: map.keySet()){
                for(int x: map.get(j))
                    arr.add(x);
            }
            
            result.add(arr);
        }
        
        return result;
    }
}
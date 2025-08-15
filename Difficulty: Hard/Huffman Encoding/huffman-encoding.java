// User function Template for Java

class Solution {
    class Node{
        String s;
        int value,index;
        Node left,right;
        
        Node(String s,int v,int index){
            this.s=s;
            this.value=v;
            this.index = index;
        }
    }
    
    public ArrayList<String> huffmanCodes(String S, int f[], int N) {
        // Code here
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->{
            if(a.value != b.value)
                return a.value-b.value;
                
            return 1;
        });
        
        for(int i=0;i<N;i++)
            pq.offer(new Node(S.charAt(i)+"",f[i],i));
        
        int oc=N;
        
        while(pq.size()>1){
            Node left = pq.poll();
            Node right = pq.poll();
            
            Node newNode = new Node(left.s+right.s,left.value+right.value,oc++);
            newNode.left = left;
            newNode.right = right;
            
            pq.offer(newNode);
        }
        Node node = pq.poll();
        ArrayList<String> result = new ArrayList<>();
        
        solve(node,"",result);
        
        if(node.left==null && node.right==null)
            result.add("0");
            
        return result;
    }
    
    void solve(Node node,String s,ArrayList<String> result){
        if(node.left==null && node.right==null){
            result.add(s);
            return;
        }
        
        if(node.left!=null)
            solve(node.left,s+"0",result);
            
        if(node.right!=null)
            solve(node.right,s+"1",result);
    }
}
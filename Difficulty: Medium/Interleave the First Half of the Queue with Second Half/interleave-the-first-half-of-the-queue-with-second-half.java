class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> temp = new LinkedList<>();
        int size = q.size();
        
        for(int i=0;i<size/2;i++)
            temp.offer(q.poll());
        
        while(!temp.isEmpty()){
            q.offer(temp.poll());
            q.offer(q.poll());
        }
        
        if(size%2==1)
            q.poll();
    }
}

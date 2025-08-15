class Queues {
    Queue<Integer> que = new LinkedList<Integer>();

    void push(int a) {
        // code here
        int size = que.size();
        que.offer(a);
        
        while(size-->0){
            que.offer(que.poll());
        }
    }

    int pop() {
        // code here
        if(que.isEmpty())
            return -1;
        
        return que.poll();
    }
}
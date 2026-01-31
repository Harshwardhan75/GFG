class kQueues {
    Queue<Integer>[] que;
    int size;
    int currentSize = 0;
    @SuppressWarnings("unchecked")
    public kQueues(int n, int k) {
        // Initialize your data members
        que = (Queue<Integer>[]) new LinkedList[k];
        this.size = n;
        Arrays.setAll(que,o-> new LinkedList<>());
    }

    void enqueue(int x, int i) {
        // enqueue element x into queue number i
        que[i].offer(x);
        currentSize++;
    }

    int dequeue(int i) {
        // dequeue element from queue number i
        if(que[i].isEmpty())
            return -1;
        currentSize--;
        return que[i].poll();
    }

    boolean isEmpty(int i) {
        // check if queue i is empty
        return que[i].isEmpty();
    }

    boolean isFull() {
        // check if array is full
        return currentSize==size;
    }
}

class SpecialQueue {

    TreeMap<Integer,Integer> tmap;
    Queue<Integer> que;

    public SpecialQueue() {
        // Define Data Structures
        tmap = new TreeMap<>();
        que = new LinkedList<>();
    }

    public void enqueue(int x) {
        // Insert element into the queue
        que.offer(x);
        tmap.compute(x,(k,v)->v==null?1:v+1);
    }

    public void dequeue() {
        // Remove element from the queue
        int val = que.poll();
        tmap.put(val,tmap.get(val)-1);
        if(tmap.get(val)==0)
            tmap.remove(val);
    }

    public int getFront() {
        // Get front element
        return que.peek();
    }

    public int getMin() {
        // Get minimum element
        return tmap.firstKey();
    }

    public int getMax() {
        // Get maximum element
        return tmap.lastKey();
    }
}
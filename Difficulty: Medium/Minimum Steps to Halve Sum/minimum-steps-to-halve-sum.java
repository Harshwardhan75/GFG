class Solution {
    public int minOperations(int[] arr) {
        // code here
        PriorityQueue<Double> pq = new PriorityQueue<>((a,b)->Double.compare(b,a));
        double sum = 0;
        
        for(int i: arr){ 
            sum += i;
            pq.offer((double)i);
        }
        
        double required = sum/2.0;
        
        int operations = 0;
        
        while(sum>required){
            double first = pq.poll();
            first = first/2.0;
            sum-=first;
            pq.offer(first);
            operations++;
        }
        
        return operations;
    }
}
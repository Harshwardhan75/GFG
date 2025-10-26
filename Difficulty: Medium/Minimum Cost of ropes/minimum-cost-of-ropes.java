class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i: arr) pq.offer(i);
        
        int sum = 0;
        
        while(pq.size()>1){
            int val = pq.poll()+pq.poll();
            pq.offer(val);
            sum += val;
        }
        
        return sum;
    }
}
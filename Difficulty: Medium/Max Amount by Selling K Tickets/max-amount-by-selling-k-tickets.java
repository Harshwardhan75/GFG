class Solution {
    int MOD = 1_000_000_000+7;
    
    public int maxAmount(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i: arr) pq.offer(i);
        
        int sum = 0;
        
        while(!pq.isEmpty() && k-->0){
            int val = pq.poll();
            sum =  (sum + val)%MOD;
            val--;
            if(val>0)
                pq.offer(val);
        }
        
        return sum;
    }
}
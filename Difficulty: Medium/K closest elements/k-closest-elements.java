class Solution {
    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int v = (Math.abs(b-x)-Math.abs(a-x));
            if(v==0)
                return a-b;
            return v;
        });
        
        for(int i: arr){
            if(i!=x){
                pq.offer(i);
                if(pq.size()>k)
                    pq.poll();
            }
        }
        
        int[] result=new int[k];
        while(k-->0){
            result[k]=pq.poll();
        }
        
        return result;
    }
}

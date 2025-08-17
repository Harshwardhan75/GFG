class Solution {
    public void rearrange(int[] arr, int x) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            int one = Math.abs(a[0]-x);
            int two = Math.abs(b[0]-x);
            
            if(one == two){
                return a[1]-b[1];
            }
            
            return one-two;
        });
        
        int n = arr.length;
        
        for(int i=0;i<n;i++)    pq.offer(new int[]{arr[i],i});
        
        for(int i = 0;i<n;i++)
            arr[i] = pq.poll()[0];
    }
}

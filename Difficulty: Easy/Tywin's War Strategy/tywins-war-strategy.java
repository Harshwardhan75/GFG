class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        int n= arr.length;
        
        for(int i=0;i<n;i++){
            int mod = arr[i]%k;
            mod = (k - mod)%k;
            pq.offer(new int[]{arr[i],mod});
        }
        
        int val = 0;
        int sum = 0;
        
        while(!pq.isEmpty()){
            int[] node = pq.poll();
            sum+=node[1];
            val++;
            
            if(val>=(n+1)/2)
                return sum;
        }
        
        return sum;
    }
}
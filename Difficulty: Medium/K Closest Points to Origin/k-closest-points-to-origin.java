class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return (b[0]*b[0]+b[1]*b[1]) - (a[0]*a[0]+a[1]*a[1]);
        });
        
        for(int[] p: points){
            pq.offer(p);
            if(pq.size()>k)
                pq.poll();
        }
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        pq.forEach(p->{
            result.add(new ArrayList<>(Arrays.asList(p[0],p[1])));
        });
        
        return result;
    }
}
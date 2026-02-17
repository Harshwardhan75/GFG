
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
        Arrays.sort(arr,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int max = 0;
        
        for(int[] i: arr){
            while(!pq.isEmpty() && pq.peek()<i[0])
                pq.poll();
            
            pq.offer(i[1]);
            max = Math.max(max,pq.size());
        }
        
        return max;
    }
}

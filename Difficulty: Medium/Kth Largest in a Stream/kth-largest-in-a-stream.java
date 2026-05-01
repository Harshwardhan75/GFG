class Solution {
    class SegmentTree{
        int[] seg;
        public SegmentTree(int SIZE){
            seg = new int[4*SIZE];
        }
        
        void update(int index,int low,int high,int updateIndex){
            if(low==high){
                seg[index]+=1;
                return;
            }
            
            int mid = (low+high)>>1;
            
            if(updateIndex<=mid)
                update(2*index+1,low,mid,updateIndex);
            else
                update(2*index+2,mid+1,high,updateIndex);
            
            seg[index] = seg[2*index+1] + seg[2*index+2];
        }
        
        // int query(int index,int low,int high)
    }
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i: arr){
            pq.offer(i);
            
            if(pq.size()>k)
                pq.poll();
            
            result.add(pq.size()==k?pq.peek():-1);
        }
        
        return result;
    }
}
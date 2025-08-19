class Solution {
    class SegmentTree{
        int[][] seg;
        
        SegmentTree(int n){
            seg = new int[4*n][];
        }
        
        void build(int index,int low,int high,int[] arr){
            if(low==high){
                seg[index]=new int[]{arr[low],low};
                return;
            }
            
            int mid = (low+high)>>1;
            
            build(2*index+1,low,mid,arr);
            build(2*index+2,mid+1,high,arr);
            
            if(seg[2*index+1][0]<seg[2*index+2][0])
                seg[index] = seg[2*index+1];
            else
                seg[index] = seg[2*index+2];
        }
        
        int query(int index,int low,int high,int value){
                
            if(low==high){
                return seg[index][1];
            }
            
            if(seg[index][0]>=value)
                return -1;
            
            int mid = (low+high)>>1;
            
            if(seg[2*index+2][0]<value)
                return query(2*index+2,mid+1,high,value);
            else
                return query(2*index+1,low,mid,value);
        }
    }
    
    public ArrayList<Integer> farMin(int[] arr) {
        // Code Here
        int n = arr.length;
        SegmentTree stree = new SegmentTree(n);
        
        stree.build(0,0,n-1,arr);
        // System.out.println(Arrays.toString(stree.seg[0]));
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int res = stree.query(0,0,n-1,arr[i]);
            if(res>i)
                result.add(res);
            else
                result.add(-1);
        }
        
        return result;
    }
}
class Solution {
    
    static class SegmentTree{
        int[] seg;
        
        public SegmentTree(int n){
            seg = new int[4*n];
        }
        
        void build(int index,int low,int high,int[] arr){
            if(low==high){
                seg[index] = arr[low];
                return;
            }
            
            int mid = (low+high)>>1;
            
            build(2*index+1,low,mid,arr);
            build(2*index+2,mid+1,high,arr);
            
            seg[index] = seg[2*index+1] + seg[2*index+2];
        }
        
        void update(int index,int low,int high,int updateIndex){
            if(low==high){
                seg[index]--;
                return;
            }
            
            int mid = (low+high)>>1;
            
            if(updateIndex<=mid)
                update(2*index+1,low,mid,updateIndex);
            else
                update(2*index+2,mid+1,high,updateIndex);
                
            seg[index] = seg[2*index+1] + seg[2*index+2];
        }
        
        int query(int index,int low,int high,int l,int r){
            if(r<low || high<l)
                return 0;
            
            if(l<=low && high<=r)
                return seg[index];
            
            int mid = (low+high)>>1;
            
            int left = query(2*index+1,low,mid,l,r);
            int right = query(2*index+2,mid+1,high,l,r);
            
            return left + right;
        }
    }
    static int inversionCount(int arr[]) {
        // Code Here
        int max = Arrays.stream(arr).max().orElse(0)+1;
        SegmentTree stree = new SegmentTree(max);
        int[] freq = new int[max];
        for(int i: arr)    freq[i]++;
        
        stree.build(0,0,max-1,freq);
        
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            stree.update(0,0,max-1,arr[i]);
            count += stree.query(0,0,max-1,0,arr[i]-1);
        }
        
        return count;
    }
}
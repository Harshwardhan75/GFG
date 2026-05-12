class Solution {
    class SegmentTree{
        long[] seg;
        
        public SegmentTree(int n){
            seg = new long[4*n];
        }
        
        void build(int index,int low,int high,int[] arr){
            if(low==high){
                seg[index] = arr[low];
                return;
            }
            
            int mid = (low+high)>>1;
            
            build(2*index+1,low,mid,arr);
            build(2*index+2,mid+1,high,arr);
            
            seg[index] = getLCM(seg[2*index+1],seg[2*index+2]);
        }    
        
        void update(int index,int low,int high,int updateIndex,int value){
            if(low==high){
                seg[index] = value;
                return;
            }
            
            int mid = (low+high)>>1;
            
            if(updateIndex<=mid)
                update(2*index+1,low,mid,updateIndex,value);
            else
                update(2*index+2,mid+1,high,updateIndex,value);
            
            seg[index] = getLCM(seg[2*index+1],seg[2*index+2]);
        }
        
        long query(int index,int low,int high,int l,int r){
            if(high<l || r<low)
                return Integer.MIN_VALUE;
            
            if(l<=low && high<=r)
                return seg[index];
            
            int mid = (low+high)>>1;
            
            long left = query(2*index+1,low,mid,l,r);
            long right = query(2*index+2,mid+1,high,l,r);
            
            if(left==Integer.MIN_VALUE)
                return right;
            if(right==Integer.MIN_VALUE)
                return left;
                
            return getLCM(left,right);
        }
    }
    
    public ArrayList<Long> RangeLCMQuery(int[] arr, int[][] queries) {
        // code here
        int n = arr.length;
        SegmentTree stree = new SegmentTree(n);
        
        stree.build(0,0,n-1,arr);
        
        ArrayList<Long> result = new ArrayList<>();
        
        for(int[] q: queries){
            if(q[0]==1){
                stree.update(0,0,n-1,q[1],q[2]);
            }
            else{
                result.add(stree.query(0,0,n-1,q[1],q[2]));
            }
        }
        
        return result;
    }
    
    long getLCM(long a,long b){
        return ((long)a*b)/GCD(a,b);
    }
    
    long GCD(long a,long b){
        while(a>0 && b>0)
        {
            if(a>b)
                a%=b;
            else
                b%=a;
        }
        
        return Math.max(a,b);
    }
}
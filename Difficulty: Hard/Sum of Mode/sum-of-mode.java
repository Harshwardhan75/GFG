class SegmentTree{
    int[] seg;
    SegmentTree(int n){
        seg = new int[4*n];
    }
    
    void update(int index,int low,int high,int updateIndex,int value){
        if(low==high){
            seg[index]+=value;
            return;
        }
        
        int mid = (low+high)>>1;
        
        if(updateIndex<=mid)
            update(2*index+1,low,mid,updateIndex,value);
        else
            update(2*index+2,mid+1,high,updateIndex,value);
            
        seg[index]= Math.max(seg[2*index+1],seg[2*index+2]);
    }
    
    int query(int index,int low,int high){
        if(low==high){
            return low;
        }
        
        int mid = (low+high)>>1;
        
        int left = 2*index+1;
        int right = 2*index+2;
        
        if(seg[left]==seg[index])
            return query(left,low,mid);
        else
            return query(right,mid+1,high);
    }
}

class Solution {
    public int sumOfModes(int[] arr, int k) {
        // code here
        int max = Arrays.stream(arr).max().orElse(0);
        SegmentTree stree = new SegmentTree(max+1);
        
        int right = 0;
        int left = 0;
        int sum = 0;
        int n = arr.length;
        
        while(right<n){
            stree.update(0,0,max,arr[right],1);
            
            if(right>=k-1){
                sum += stree.query(0,0,max);
                stree.update(0,0,max,arr[left],-1);
                left++;
            }
            
            right++;
        }
        
        return sum;
    }
}
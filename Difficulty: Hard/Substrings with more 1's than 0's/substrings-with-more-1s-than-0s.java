class SegmentTree{
    int[] seg;
    
    public SegmentTree(int n){
        seg = new int[4*n];
    }
    
    void update(int index,int low,int high,int updateIndex){
        if(low==high){
            seg[index]++;
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
        
        return query(2*index+1,low,mid,l,r) + query(2*index+2,mid+1,high,l,r);
    }
}

class Solution {
    public int countSubstring(String s) {
        // code here
        TreeSet<Integer> tset = new TreeSet<>();
        int prefix = 0;
        tset.add(0);
        for(char c: s.toCharArray()){
            prefix += (c=='0')?-1:1;
            tset.add(prefix);
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        
        int index = 0;
        for(int i: tset){
            map.put(i,index++);
        }
        
        SegmentTree stree = new SegmentTree(map.size());
        prefix = 0;
        stree.update(0,0,map.size()-1,map.get(0));
        int count = 0;
        for(char c: s.toCharArray()){
            prefix += (c=='0')?-1:1;
            count += stree.query(0,0,map.size()-1,0,map.get(prefix)-1);
            stree.update(0,0,map.size()-1,map.get(prefix));
        }
        
        return count;
    }
}
class Solution {
    public int andInRange(int l, int r) {
        // Code here
        long result = 0;
        for(long i=32;i>=0;i--){
            long a = 1L<<i;
            long b = 1L<<(i+1);
            
            if(a<=l && r<b){
                result |= a;
                l -= a;
                r -= a;
            }
        }
        
        return (int)result;
    }
}

class Solution {
    int countWays(int n, int k) {
        // code here.
        int total = k;
        
        int same = 0, diff = k;
        
        for(int i=2;i<=n;i++){
            same = diff;
            
            diff = (total*(k-1));
            
            total = same + diff;
        }
        
        return total;
    }
    
}

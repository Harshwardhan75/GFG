class Solution {
    int findWays(int n) {
        // code here
        if(n%2==1)
            return 0;
        return solve(0,0,n/2);
    }
    
    int solve(int open,int close,int total){
        if(open==close && close == total)
            return 1;
        
        if(open>total || close>total)
            return 0;
        
        return solve(open+1,close,total) + 
            (open>close?solve(open,close+1,total):0);
    }
}

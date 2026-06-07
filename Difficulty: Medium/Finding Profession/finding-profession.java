class Solution {
    public String profession(int level, int pos) {
        // code here
        return solve(level,pos-1)==1?"Enginer":"Doctor";
    }
    
    int solve(int level,int pos){
        if(pos==0)
            return 1;
        
        if(pos%2==0)
            return solve(level-1,(pos)/2);
        
        return 1-solve(level-1,(pos)/2);
    }
}

/*    2 
        15            8->4 left 2^3
    7       7        4->2 left  2^2
 3     3  3   3      2->1 right 2^1
1  1  1 1 1 1 1 1    1->0 yahi  2^0


        7           2^2 4->2 right 4 se 2
    3       3       2^1 2->1 right 2 se 1
1       1 1     1   2^0 1->0 yahi


*/
class Solution {
    public int findPosition(int n) {
        // code here
        if((n&(n-1))!=0)
            return -1;
        
        for(int i=0;i<31;i++){
            if((n&(1<<i))!=0)
                return i+1;
        }
        
        return 0;
    }
}
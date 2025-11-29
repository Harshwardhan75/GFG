class Solution {
    public static int countSetBits(int n) {
        // code here
        if(n<=1)
            return n;
        
        
        int bitcount = 0;
        
        while((1<<bitcount+1)<=n)
            bitcount ++;
        
        return countSetBits(n - (1<<bitcount))+
            (n-(1<<bitcount))+((1<<bitcount>>1)*bitcount)+1;
    }
}
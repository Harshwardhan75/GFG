// User function Template for Java

class Solution {

    // Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n) {

        // Your code here
        return find(n);
    }
    
    static int find(int n){
        if(n<0)
            return 0;
            
        int bitcount = 0;
        
        while((1<<(bitcount+1))<=n){
            bitcount++;
        }
        
        int sum = 0;
        
        for(int i=1;i<=bitcount;i++)
            sum+=1<<bitcount>>1;
        
        return find(n-(1<<bitcount))+(n-(1<<bitcount))+
            sum+1;
    }
}
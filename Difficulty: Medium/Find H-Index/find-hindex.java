

// User function Template for Java
class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int[] freq=new int[citations.length+1];
        for(int i: citations){
            if(i>citations.length)
                freq[citations.length]++;
            else
                freq[i]++;
        }
        
        int hindex=freq[freq.length-1];
        int n=freq.length-1;
        
        while(hindex<n){
            n--;
            hindex+=freq[n];
        }
        
        return n;
    }
}
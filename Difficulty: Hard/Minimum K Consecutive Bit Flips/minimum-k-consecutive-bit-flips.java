class Solution {
    public int kBitFlips(int[] arr, int k) {
        // code here
        int n = arr.length;
        int count = 0;
        int[] prefix = new int[n];
        int currentParity = 0;
        
        for(int i=0;i<n;i++){
            if(i>=k){
                currentParity ^= prefix[i-k];
            }
            
            if((arr[i]^currentParity) == 0){
                if(i+k>n)   return -1;
                
                count++;
                currentParity^=1;
                prefix[i]=1;
            }
        }
        
        
        return count;
    }
}

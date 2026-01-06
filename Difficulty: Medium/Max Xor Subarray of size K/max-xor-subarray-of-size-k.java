class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int maxXor = 0;
        int xor = 0;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            xor ^= arr[i];
            
            if(i>=k-1){
                maxXor = Math.max(maxXor,xor);
                xor ^= arr[i+1-k];
            }
        }
        
        return maxXor;
    }
}

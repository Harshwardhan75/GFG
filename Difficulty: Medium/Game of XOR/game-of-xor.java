class Solution {
    public int subarrayXor(int[] arr) {
        // code here
        int xor = 0;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n - i;
            
            int total = (left%2 * right%2) % 2;
            
            if(total == 1)
                xor ^= arr[i];
        }
        
        return xor;
    }
}
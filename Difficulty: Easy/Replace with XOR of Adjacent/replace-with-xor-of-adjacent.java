class Solution {
    public void replaceElements(int[] arr) {
        // code here
        int n = arr.length;
        if(n==2){
            arr[0] = arr[1] = arr[0]^arr[1];
            return;
        }
        
        int[] result = new int[n];
        result[0] = arr[0]^arr[1];
        result[n-1] ^= arr[n-1]^arr[n-2];
        
        for(int i=1;i<n-1;i++)
            result[i] = arr[i-1]^arr[i+1];
        
        for(int i=0;i<n;i++)
            arr[i] = result[i];
    }
}
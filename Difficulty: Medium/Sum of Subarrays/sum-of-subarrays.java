class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int sum = 0;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int index=i+1;
            sum += arr[i]*(index*(n-index+1));
        }
        
        return sum;
    }
}

class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        return find(arr,k) - find(arr,k-1);
    }
    
    int find(int[] arr,int k){
            
        int n = arr.length;
        int left = 0, right = 0;
        
        int count = 0;
        int result = 0;
        
        while(right<n){
            count+=arr[right]%2;
            
            while(count>k){
                count-=arr[left]%2;
                left++;
            }
            
            result += right-left+1;
            right++;
        }
        
        return result;
    }
}

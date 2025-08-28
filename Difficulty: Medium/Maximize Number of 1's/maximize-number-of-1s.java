class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int max = 0;
        int right = 0,left = 0;
        int count = 0;
        int n = arr.length;
        
        while(right<n){
            if(arr[right]==0)
                count++;
            
            while(count>k){
                if(arr[left]==0)
                    count--;
                left++;
            }
            
            max = Math.max(max,right-left+1);
            right++;
        }
        
        return max;
    }
}
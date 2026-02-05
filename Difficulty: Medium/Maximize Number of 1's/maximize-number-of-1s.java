class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int left = 0, right = 0;
        int count = 0;
        int max = 0;
        int n = arr.length;
        
        while(right<n){
            count += 1-arr[right];
            
            while(count>k){
                count -= 1-arr[left];
                left++;
            }
            
            max = Math.max(max,right-left+1);
            // System.out.println(max+" "+left+" "+right);
            right++;
        }
        return max;
    }
}
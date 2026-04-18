class Solution {
    int maxOnes(int[] arr) {
        // code here
        int ones = Arrays.stream(arr).sum();
        
        int currentOne = 0;
        int left = 0, right = 0;
        int n = arr.length;
        
        int max = 0;
        
        while(right<n){
            if(arr[right]==1){
                currentOne++;
            }
            
            int length = right - left + 1;
            int currentZero = length - currentOne;
            
            while(currentOne>currentZero){
                if(arr[left]==1){
                    currentOne --;
                }
                left++;
                length = right - left + 1;
                currentZero = length - currentOne;
            }
            
            max = Math.max(max,ones - currentOne + currentZero);
            right++;
        }
        
        return max;
    }
};
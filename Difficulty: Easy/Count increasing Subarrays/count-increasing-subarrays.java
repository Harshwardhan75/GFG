class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int count = 0;
        int right = 0;
        
        while(right<arr.length){
            int left = right;
            right++;
            
            while(right<arr.length && arr[right-1]<arr[right])
                right++;
            
            int total = (right-left);
            
            total = (total*(total+1))/2;
            
            count += total - (right-left);
        }
        
        return count;
    }
}

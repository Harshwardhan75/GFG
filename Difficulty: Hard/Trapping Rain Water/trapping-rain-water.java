class Solution {
    public int maxWater(int arr[]) {
        // code here
        int leftMax = 0, rightMax = 0;
        
        int left = 0 , right = arr.length-1;
        int count = 0;
        
        while(left<right){
            if(arr[left]<arr[right]){
                if(leftMax>arr[left])
                    count += leftMax - arr[left];
                else
                    leftMax = arr[left];
                    
                left++;
            }
            else{
                if(rightMax>arr[right])
                    count += rightMax - arr[right];
                else
                    rightMax = arr[right];
                
                right--;
            }
        }
        
        return count;
    }
}

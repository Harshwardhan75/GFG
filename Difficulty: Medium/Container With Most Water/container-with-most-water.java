class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int left = 0, right = arr.length-1;
        int max = 0;
        
        while(left<right){
            int dist = right - left;
            int min = Math.min(arr[left],arr[right]);
            max = Math.max(max,dist*min);
            
            if(arr[left]<arr[right]){
                left++;  
            }
            else{
                right--;
            }
        }
        
        return max;
    }
}
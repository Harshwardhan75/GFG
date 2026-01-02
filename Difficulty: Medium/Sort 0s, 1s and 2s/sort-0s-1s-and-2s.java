class Solution {
    public void sort012(int[] arr) {
        // code here
        int low,mid,high;
        int n = arr.length;
        low = mid = 0;
        high = n - 1;
        
        while(mid<=high){
            if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high --;
            }
        }
    }
}
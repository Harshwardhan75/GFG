class Solution {
    int sumExceptFirstLast(int[] arr) {
        // your code here
        int n = arr.length;
        int sum = 0;
        
        for(int i = 1 ;i<n-1;i++)
            sum+=arr[i];
            
        return sum;
    }
}
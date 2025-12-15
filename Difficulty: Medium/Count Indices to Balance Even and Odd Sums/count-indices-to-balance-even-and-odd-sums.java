class Solution {
    public int cntWays(int[] arr) {
        // code here
        int total_odd = 0;
        int total_even = 0;
        for(int i=0; i<arr.length; i++){
            if(i%2==0) total_even += arr[i]; // evens sum
            else total_odd += arr[i]; // odds sum
        }
        int count = 0; // number of indices that elements can be removed
        
        int even_sum_before = 0; // left part even sum
        int odd_sum_before = 0; // left part odd sum
        for(int i=0; i<arr.length; i++){
            int even_sum_after = total_even - even_sum_before - (i%2==0 ? arr[i] : 0); // right part even sum
            int odd_sum_after  = total_odd  - odd_sum_before  - (i%2!=0 ? arr[i] : 0); // right part odd sum
            
            if(even_sum_before + odd_sum_after == odd_sum_before + even_sum_after) count++; // if left and right parts are equal => we got a index
            
            // add curr element to left sums
            if(i%2==0) even_sum_before += arr[i];
            else odd_sum_before += arr[i];
        }
        
        return count; // ans
    }
}

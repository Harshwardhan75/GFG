class Solution {
    public int minimumCoins(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        long[] prefix = new long[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int minRemoved = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            // Lower bound = arr[i], Upper bound = arr[i] + k
            int upper = upperBound(arr, arr[i] + k);
            
            long removedLeft = prefix[i]; // Remove all coins from piles < arr[i]
            long removedRight = (prefix[n] - prefix[upper]) - (long)(n - upper) * (arr[i] + k);
            minRemoved = (int)Math.min(minRemoved, removedLeft + removedRight);
        }

        return minRemoved;
    }

    private int upperBound(int[] arr, int target) {
        int lo = 0, hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}

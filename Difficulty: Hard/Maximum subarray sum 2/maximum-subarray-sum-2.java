class Solution {
    int maxSubarrSum(int[] arr, int a, int b) {
        int n = arr.length;
        long[] prefix = new long[n+1];
        for (int i=0; i<n; i++) prefix[i+1] = prefix[i] + arr[i];
    
        Deque<Integer> dq = new ArrayDeque<>(); // store indices of prefix
        long ans = Long.MIN_VALUE;
    
        for (int r=0; r<n; r++) {
            // Add index (r - a + 1) into deque if valid
            if (r - a + 1 >= 0) {
                int idx = r - a + 1;
                while (!dq.isEmpty() && prefix[dq.peekLast()] >= prefix[idx])
                    dq.pollLast();
                dq.addLast(idx);
            }
    
            // Remove indices out of window (length > b)
            if (!dq.isEmpty() && dq.peekFirst() < r - b + 1) {
                dq.pollFirst();
            }
    
            // Update answer if deque not empty
            if (!dq.isEmpty()) {
                ans = Math.max(ans, prefix[r+1] - prefix[dq.peekFirst()]);
            }
        }
        return (int) ans;
    }

}
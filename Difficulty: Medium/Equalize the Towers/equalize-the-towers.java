class Solution {
    public int minCost(int[] heights, int[] cost) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        // Determine search range
        for (int h : heights) {
            low = Math.min(low, h);
            high = Math.max(high, h);
        }

        // Ternary search to minimize cost
        while (high - low > 2) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            long cost1 = totalCost(heights, cost, mid1);
            long cost2 = totalCost(heights, cost, mid2);

            if (cost1 < cost2) {
                high = mid2;
            } else {
                low = mid1;
            }
        }

        // Check final possible values
        long answer = Long.MAX_VALUE;
        for (int h = low; h <= high; h++) {
            answer = Math.min(answer, totalCost(heights, cost, h));
        }

        return (int) answer;
    }

    private long totalCost(int[] heights, int[] cost, int target) {
        long total = 0;
        for (int i = 0; i < heights.length; i++) {
            total += 1L * Math.abs(heights[i] - target) * cost[i];
        }
        return total;
    }
}

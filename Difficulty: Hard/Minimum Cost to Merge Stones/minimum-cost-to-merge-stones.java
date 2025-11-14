class Solution {
    public static int mergeStones(int[] stones, int k) {
        // code here
        int n = stones.length;
        
        // Check if it is possible to merge into one pile
        if ((n - 1) % (k - 1) != 0) return -1;

        // prefix sum for quick range sum calculation
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stones[i];
        }

        // memo[i][j] = min cost to merge stones[i..j]
        int[][][] memo = new int[n][n][k + 1];
        for (int[][] m1 : memo)
            for (int[] m2 : m1)
                Arrays.fill(m2, -1);

        return dfs(0, n - 1, 1, k, prefix, memo);
    }

    private static int dfs(int i, int j, int piles, int k, int[] prefix, int[][][] memo) {
        if (memo[i][j][piles] != -1) return memo[i][j][piles];

        int n = j - i + 1;
        if (n < piles) return Integer.MAX_VALUE / 2; // impossible
        if (n == piles) return 0; // no cost, already that many piles

        int res = Integer.MAX_VALUE / 2;

        if (piles == 1) {
            int cost = dfs(i, j, k, k, prefix, memo) + prefix[j + 1] - prefix[i];
            res = Math.min(res, cost);
        } else {
            // try every possible partition
            for (int m = i; m < j; m += k - 1) {
                int left = dfs(i, m, 1, k, prefix, memo);
                int right = dfs(m + 1, j, piles - 1, k, prefix, memo);
                res = Math.min(res, left + right);
            }
        }

        memo[i][j][piles] = res;
        return res;
    }
}

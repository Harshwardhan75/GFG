class Solution {
    // No
    static String matrixChainOrder(int arr[]) {
        int n = arr.length;

        // dp[i][j] = minimum cost to multiply matrix i..j
        int[][] dp = new int[n][n];

        // split[i][j] = index k where optimal split occurs
        int[][] split = new int[n][n];

        // L = chain length
        for (int L = 2; L < n; L++) {
            for (int i = 1; i <= n - L; i++) {
                int j = i + L - 1;

                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j]
                               + arr[i - 1] * arr[k] * arr[j];

                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                        split[i][j] = k;
                    }
                }
            }
        }

        // Build the answer string using recursion
        return buildString(split, 1, n - 1);
    }

    // Recursively build optimal parenthesization
    static String buildString(int[][] split, int i, int j) {
        if (i == j) {
            return String.valueOf((char) ('A' + i - 1)); // A, B, C...
        }

        int k = split[i][j];

        return "(" + buildString(split, i, k)
                   + buildString(split, k + 1, j)
                   + ")";
    }
}


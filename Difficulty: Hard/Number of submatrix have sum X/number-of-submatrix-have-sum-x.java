class Solution {
    public int countSquare(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[][] pref = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                pref[i][j] = mat[i - 1][j - 1]
                        + pref[i - 1][j]
                        + pref[i][j - 1]
                        - pref[i - 1][j - 1];
            }
        }
        int count = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                int maxSize = Math.min(n - r, m - c);
                for (int k = 1; k <= maxSize; k++) {
                    int sum = pref[r + k][c + k]
                            - pref[r][c + k]
                            - pref[r + k][c]
                            + pref[r][c];
                    if (sum == x) count++;
                }
            }
        }
        return count;

    }
}
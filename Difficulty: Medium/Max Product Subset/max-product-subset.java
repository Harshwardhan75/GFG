class Solution {
    int findMaxProduct(int[] arr) {
        int n = arr.length;
        long MOD = 1000000007L;

        if (n == 1) {
            return arr[0];
        }

        int negCount = 0, zeroCount = 0;
        int maxNeg = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x == 0) {
                zeroCount++;
            } else if (x < 0) {
                negCount++;
                maxNeg = Math.max(maxNeg, x);
            }
        }

        if (zeroCount == n)
            return 0;

        if (negCount == 1 && zeroCount + negCount == n)
            return 0;

        long product = 1;
        boolean removed = false;
        int used = 0;

        for (int x : arr) {
            if (x == 0)
                continue;

            if ((negCount & 1) == 1 && x == maxNeg && !removed) {
                removed = true;
                continue;
            }

            product = (product * x) % MOD;
            used++;
        }

        if (used == 0)
            return 0;

        return (int) product;
    }
}
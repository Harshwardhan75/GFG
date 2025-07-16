class Solution {
    public int maxKPower(int n, int k) {
        // Prime factorization of k
        Map<Integer, Integer> primeFactors = getPrimeFactors(k);
        int minPower = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
            int prime = entry.getKey();
            int exponentInK = entry.getValue();

            int exponentInNFact = getPowerInFactorial(n, prime);
            minPower = Math.min(minPower, exponentInNFact / exponentInK);
        }

        return minPower;
    }

    // Get power of prime p in n!
    private int getPowerInFactorial(int n, int p) {
        int count = 0;
        while (n > 0) {
            n /= p;
            count += n;
        }
        return count;
    }

    // Prime factorization of k
    private Map<Integer, Integer> getPrimeFactors(int k) {
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i * i <= k; i++) {
            while (k % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                k /= i;
            }
        }
        if (k > 1) {
            factors.put(k, factors.getOrDefault(k, 0) + 1);
        }
        return factors;
    }
}

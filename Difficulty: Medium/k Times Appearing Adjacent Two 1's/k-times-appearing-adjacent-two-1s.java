class Solution {
	int MOD = 1_000_000_000 + 7;
	int[][][] dp;
	public int countStrings(int n, int k) {
		// code here
		this.dp = new int[n + 1][k + 1][3];
		for (int[][] II: dp)
			for (int[] I: II)
				Arrays.fill(I, -1);
		
		return solve(n, k, -1);
	}
	
	int solve(int n, int k, int prev) {
		if (n == 0)
			return k == 0?1:0;
		
		if (dp[n][k][prev + 1] != -1)
			return dp[n][k][prev + 1];
		int zero = solve(n - 1, k, 0);
		
		int one = 0;
		
		if (prev == 1) {
			if (k>0)
				one = solve(n - 1, k - 1, 1);
		}
		else {
			one = solve(n - 1, k, 1);
		}
		
		return dp[n][k][prev + 1] = (zero + one)%MOD;
	}
	
	int power(int base, int power) {
		long result = 1l;
		
		while (power>0) {
			if (power%2 == 1)
				result = (result*base)%MOD;
			
			base = (base*base)%MOD;
			power> >= 1;
		}
		
		return (int) result;
	}
}

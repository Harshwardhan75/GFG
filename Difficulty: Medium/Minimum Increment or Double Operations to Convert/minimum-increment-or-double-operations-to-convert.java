class Solution {
	public int countMinOperations(int arr[]) {
		int cnt = 0;
		int n = arr.length;
		
		while (!isArrZero(arr)) {
			if (isAllEven(arr)) {
				for (int j = 0; j<n; j++) {
					arr[j] = arr[j]/2;
				}
				cnt++;
			} else {
				for (int i = 0; i<n; i++) {
					if ((arr[i]&1) == 1) {
						arr[i] = arr[i]-1;
						cnt++;
					}
				}
			}
		}
		
		return cnt;
	}
	
	private boolean isArrZero(int[] arr) {
		int sum = 0;
		for (int num:arr) {
			sum += num;
			if (sum != 0) {
				return false;
			}
		}
		return sum == 0;
	}
	
	private boolean isAllEven(int[] arr) {
		for (int num:arr) {
			if ((num&1) != 0) {
				return false;
			}
		}
		return true;
	}
}

class Solution {
    public int countSubset(int[] arr, int k) {
        int n = arr.length;
        int mid = n / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        List<Integer> leftSums = new ArrayList<>();
        List<Integer> rightSums = new ArrayList<>();

        genSums(left, 0, 0, leftSums);
        genSums(right, 0, 0, rightSums);

        Map<Integer, Integer> freq = new HashMap<>();
        for (int s : rightSums)
            freq.put(s, freq.getOrDefault(s, 0) + 1);

        int ans = 0;
        for (int s : leftSums)
            ans += freq.getOrDefault(k - s, 0);

        return ans;
    }

    void genSums(int[] arr, int idx, int sum, List<Integer> res) {
        if (idx == arr.length) {
            res.add(sum);
            return;
        }
        genSums(arr, idx + 1, sum, res);            // exclude
        genSums(arr, idx + 1, sum + arr[idx], res); // include
    }
}

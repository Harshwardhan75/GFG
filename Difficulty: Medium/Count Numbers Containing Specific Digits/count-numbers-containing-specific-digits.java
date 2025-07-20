class Solution {
    public int countValid(int n, int[] arr) {
        Set<Integer> forbidden = new HashSet<>();
        for (int d : arr) forbidden.add(d);

        // Total valid n-digit numbers
        int total = (int) (9 * Math.pow(10, n - 1));

        // Allowed digits = 0-9 excluding digits in arr[]
        List<Integer> allowed = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            if (!forbidden.contains(i)) allowed.add(i);
        }

        if (allowed.size() == 0) return total; // all digits are required ⇒ all valid

        // Count n-digit numbers that do NOT contain any of the arr[] digits
        int countWithoutForbidden = 0;

        for (int d : allowed) {
            if (d == 0) continue; // skip leading zero
            int count = 1;
            for (int i = 1; i < n; i++) {
                count *= allowed.size(); // all digits allowed (with zero)
            }
            countWithoutForbidden += count;
        }

        return total - countWithoutForbidden;
    }
}

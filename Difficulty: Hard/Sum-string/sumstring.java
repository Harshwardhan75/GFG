class Solution {

    // Helper function to add two numeric strings
    String sum(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        StringBuilder S1 = new StringBuilder(s1).reverse();
        StringBuilder S2 = new StringBuilder(s2).reverse();

        int n = S1.length(), m = S2.length(), carry = 0, i = 0, j = 0;

        while (i < n || j < m || carry != 0) {
            int digitSum = carry;
            if (i < n) digitSum += S1.charAt(i++) - '0';
            if (j < m) digitSum += S2.charAt(j++) - '0';

            result.append((char) ((digitSum % 10) + '0'));
            carry = digitSum / 10;
        }

        return result.reverse().toString();
    }

    // Main function to check if a string is a sum string
    public boolean isSumString(String s) {
        int n = s.length();

        // Try all possible partitions for first and second number
        for (int i = 1; i < n; i++) {
            for (int j = 1; i + j < n; j++) {
                if (solve(s, 0, i, j)) return true;
            }
        }
        return false;
    }

    // Recursive function to check validity from a starting index
    boolean solve(String s, int index, int len1, int len2) {
        String s1 = s.substring(index, index + len1);
        String s2 = s.substring(index + len1, index + len1 + len2);
        String s3 = sum(s1, s2);

        int nextIndex = index + len1 + len2;
        if (nextIndex + s3.length() > s.length()) return false;

        String s3FromS = s.substring(nextIndex, nextIndex + s3.length());
        if (!s3.equals(s3FromS)) return false;

        if (nextIndex + s3.length() == s.length()) return true;

        return solve(s, index + len1, len2, s3.length());
    }
}

class Solution {
    public boolean stringStack(String pat, String tar) {
        int n = pat.length();
        int m = tar.length();

        int i = n - 1;
        int j = m - 1;
        int count = 0;

        while (i >= 0 && j >= 0) {
            if (pat.charAt(i) == tar.charAt(j)) {
                if (count % 2 == 0) {
                    j--;
                    count = 0;
                    i--;
                } else {
                    i--;
                    count++;
                }
            } else {
                i--;
                count++;
            }
        }

        return j < 0;
    }
}
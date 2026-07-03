class Solution {

    public int waysToIncreaseLCSBy1(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        List<List<Integer>> positions = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            positions.add(new ArrayList<>());
        }
        for (int j = 1; j <= n2; j++) {
            positions.get(s2.charAt(j - 1) - 'a').add(j);
        }

        int[][] lcsl = new int[n1 + 2][n2 + 2];
        int[][] lcsr = new int[n1 + 2][n2 + 2];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lcsl[i][j] = lcsl[i - 1][j - 1] + 1;
                } else {
                    lcsl[i][j] = Math.max(lcsl[i - 1][j], lcsl[i][j - 1]);
                }
            }
        }

        for (int i = n1; i >= 1; i--) {
            for (int j = n2; j >= 1; j--) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lcsr[i][j] = lcsr[i + 1][j + 1] + 1;
                } else {
                    lcsr[i][j] = Math.max(lcsr[i + 1][j], lcsr[i][j + 1]);
                }
            }
        }

        int base = lcsl[n1][n2];
        int ways = 0;

        for (int i = 0; i <= n1; i++) {
            for (int c = 0; c < 26; c++) {
                for (int p : positions.get(c)) {
                    if (lcsl[i][p - 1] + lcsr[i + 1][p + 1] == base) {
                        ways++;
                        break;
                    }
                }
            }
        }

        return ways;
    }
}
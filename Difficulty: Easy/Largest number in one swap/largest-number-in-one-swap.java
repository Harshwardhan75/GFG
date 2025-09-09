class Solution {
    String largestSwap(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] last = new int[26];
        for (int i = 0; i < n; i++) {
            last[chars[i] - '0'] = i; 
        }
        for (int i = 0; i < n; i++) {
            for (char ch = '9'; ch > chars[i]; ch--) {
                if (last[ch - '0'] > i) {
                    int j = last[ch - '0'];
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                    return new String(chars);
                }
            }
        }
        return s;
    }
}
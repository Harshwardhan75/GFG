class Solution {
    public boolean isBinaryPalindrome(int n) {
        // code here
        return new StringBuilder(Integer.toBinaryString(n)).reverse().toString().equals(Integer.toBinaryString(n));
    }
};
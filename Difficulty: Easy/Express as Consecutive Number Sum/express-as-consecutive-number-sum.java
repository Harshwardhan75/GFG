class Solution {
    public boolean isSumOfConsecutive(int n) {
        // code here
        return !((n&(n-1))==0);
    }
}
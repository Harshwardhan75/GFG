class Solution {
    public static int largest(int[] arr) {
        // code here
        return Arrays.stream(arr).max().orElseThrow();
    }
}

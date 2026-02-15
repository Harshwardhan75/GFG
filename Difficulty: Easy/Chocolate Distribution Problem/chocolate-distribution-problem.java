// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        
        for(int i=m-1;i<arr.size();i++){
            min = Math.min(min,arr.get(i)-arr.get(i-m+1));
        }
        
        return min;
    }
}
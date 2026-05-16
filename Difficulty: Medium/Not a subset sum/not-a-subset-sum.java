class Solution {
    public int findSmallest(int[] arr) {
        // code here
        Arrays.sort(arr);
        long max=1;
        for(int i: arr){
            if(i> max)
                break;
            max+=i;
        }
        return (int) max;
    }
}
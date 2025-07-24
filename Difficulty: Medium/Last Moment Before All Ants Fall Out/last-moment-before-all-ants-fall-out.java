class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
        int max = 0;
        
        for(int i: left){
            max=Math.max(max,i);
        }
        
        for(int i: right){
            max=Math.max(max,n-i);
        }
        
        return max;
    }
}
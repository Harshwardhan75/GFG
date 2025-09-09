class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        Arrays.sort(mices);
        Arrays.sort(holes);
        
        int max = 0;
        
        for(int i=0;i<mices.length;i++){
            max = Math.max(max,Math.abs(mices[i]-holes[i]));
        }
        
        return max;
    }
};
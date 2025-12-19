class Solution {
    public int findMoves(int[] chairs, int[] passengers) {
        // code here
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        
        int count = 0;
        
        for(int i=0;i<chairs.length;i++)
            count += Math.abs(chairs[i]-passengers[i]);
        
        return count;
    }
}

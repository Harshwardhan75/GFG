class Solution {
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> result = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
        
        while(i<n && intervals[i][1]<newInterval[0])
            result.add(intervals[i++]);
        
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        result.add(newInterval);
        while(i<n)
            result.add(intervals[i++]);
            
        return result;
    }
}

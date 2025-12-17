class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        
        ArrayList<int[]> result = new ArrayList<>();
        
        for(int[] i: arr){
            int size = result.size()-1;
            if(!result.isEmpty() && result.get(size)[1]>=i[0]){
                result.get(size)[1] = Math.max(result.get(size)[1],i[1]);
            }
            else{
                result.add(i);
            }
        }
        
        return result;
    }
}
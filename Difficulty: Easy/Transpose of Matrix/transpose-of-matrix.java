class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0;i<m;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int j=0;j<n;j++){
                temp.add(mat[j][i]);
            }
            
            result.add(temp);
        }
        
        return result;
    }
}
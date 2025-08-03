class Solution {
    public ArrayList<ArrayList<Integer>> applyDiff2D(int[][] mat, int[][] opr) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int[][] op = new int[n+1][m+1];
        
        for(int[] i: opr){
            int r1=i[1];
            int c1=i[2];
            int r2=i[3];
            int c2=i[4];
            
            op[r1][c1]+=i[0];
            op[r2+1][c2+1]+=i[0];
            op[r1][c2+1]-=i[0];
            op[r2+1][c1]-=i[0];
        }
        
        for(int i=0;i<=n;i++){
            for(int j=1;j<=m;j++){
                op[i][j]+=op[i][j-1];
            }
        }
        
        for(int i=0;i<=m;i++){
            for(int j=1;j<=n;j++){
                op[j][i]+=op[j-1][i];
            }
        }
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<m;j++){
                arr.add(mat[i][j]+op[i][j]);
            }
            result.add(arr);
        }
        
        return result;
    }
}
class Solution {
    public ArrayList<Integer> prefixSum2D(int[][] mat, int[][] queries) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[][] prefix = new int[n][m];
        
        for(int i=0;i<n;i++)    for(int j=0;j<m;j++)    prefix[i][j] = mat[i][j];
        
        for(int i=0;i<n;i++){
            int p = 0;
            for(int j=0;j<m;j++){
                p+=prefix[i][j];
                prefix[i][j] = p;
            }
        }
        
        for(int j=0;j<m;j++){
            int p = 0;
            for(int i=0;i<n;i++){
                p+=prefix[i][j];
                prefix[i][j] = p;
            }
        }
        
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int[] q: queries){
            int r1 = q[0],c1=q[1],r2=q[2],c2=q[3];
            
            int mainSum = prefix[r2][c2];
            
            int a = r1-1>=0?prefix[r1-1][c2]:0;
            int b = c1-1>=0?prefix[r2][c1-1]:0;
            
            r1--;
            c1--;
            
            int c = 0;
            if(r1>=0 && c1>=0) c = prefix[r1][c1];
            
            int sum = mainSum + c - a - b;
            
            result.add(sum);
        }
        
        return result;
    }
}

class Solution {
    public int maximumSum(int[][] mat, int k) {
        // code here
        int n = mat.length;
        int[][] prefix = new int[n][n];
        prefix[0][0] = mat[0][0];
        for(int i=1;i<n;i++){
            prefix[0][i] = prefix[0][i-1] + mat[0][i];
            prefix[i][0] = prefix[i-1][0] + mat[i][0];
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                prefix[i][j] = mat[i][j] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
            }
        }
        
        // for(int[] i: prefix)
        //     System.out.println(Arrays.toString(i));
        
        int max = Integer.MIN_VALUE;
        
        for(int i=k-1;i<n;i++){
            for(int j=k-1;j<n;j++){
                int x = i - k;
                int y = j - k;
                
                max = Math.max(max,
                    prefix[i][j]
                    - (x>=0?prefix[x][j]:0)
                    - (y>=0?prefix[i][y]:0)
                    + (x>=0 && y>=0 ? prefix[x][y]:0)
                );
                
                // System.out.println(i+" "+j+" "+max);
            }
        }
        
        return max;
    }
}
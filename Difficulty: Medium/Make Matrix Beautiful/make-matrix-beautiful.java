class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int maxr = 0;
        int totalSum = 0;
        
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum+=mat[i][j];
                totalSum+=mat[i][j];
            }
            
            maxr=Math.max(maxr,sum);
        }
        
        int maxc = 0;
        
        for(int j=0;j<m;j++){
            int sum = 0;
            for(int i=0;i<n;i++)
                sum+=mat[i][j];
            
            maxc=Math.max(maxc,sum);
        }
        
        if(maxc>maxr){
            int total = m*maxc;
            return total-totalSum;
        }
        
        int total = n*maxr;
        return total-totalSum;
    }
}
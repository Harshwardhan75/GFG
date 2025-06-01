class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        boolean[] contains=new boolean[100000+1];
        
        int n=mat1.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                contains[mat1[i][j]]=true;
            }
        }
        
        int count = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(x-mat2[i][j]>=0 && contains[x-mat2[i][j]])
                    count++;
            }
        }
        
        return count;
    }
}
class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        // code here
        int r = 0, c = 0;
        int pr = 0, pc = 0;
        int n = mat.length;
        int m = mat[0].length;
        char d = 'R';
        
        while(r>=0 && r<n && c>=0 && c<m){
            pr = r;
            pc = c;
            
            if(mat[r][c]==1){
                if(d=='R')
                    d = 'D';
                else if(d=='L')
                    d = 'U';
                else if(d=='D')
                    d = 'L';
                else
                    d = 'R';
                    
                mat[r][c] = 0;
            }
            
            if(d=='R')
                c++;
            else if(d=='L')
                c--;
            else if(d=='U')
                r--;
            else
                r++;
        }
        
        return Arrays.asList(pr,pc);
    }
}
class Solution {
    public boolean wifiRange(String s, int x) {
        // code here
        int n = s.length();
        boolean[] visited = new boolean[n];
        
        int next = -1;
        
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='1')
                next = i + x;
                
            if(i<=next)
                visited[i] = true;
        }
        
        next = n;
        
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i)=='1')
                next = i - x;
                
            if(i>=next)
                visited[i] = true;
        }
        
        for(var e: visited){
            if(!e)
                return false;
        }
        
        return true;
    }
}
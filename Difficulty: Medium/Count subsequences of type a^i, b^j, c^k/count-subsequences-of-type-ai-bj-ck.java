// User function Template for Java

class Solution {
    int MOD = 1_000_000_000+7;
    public int fun(String s) {
        // Write your code here
        int a = 0;
        int ab = 0;
        int abc = 0;
        int n = s.length();
        
        for(int i=0;i<n;i++){
            char c= s.charAt(i);
            
            if(c=='a')
                a= ((a + a)%MOD + 1)%MOD;
            
            if(c=='b')
                ab = ((a + ab)%MOD + ab)%MOD;
            
            if(c=='c')
                abc = ((ab + abc)%MOD + abc)%MOD;
        }
        
        return abc;
    }
}
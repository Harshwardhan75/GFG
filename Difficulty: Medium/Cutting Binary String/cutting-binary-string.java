class Solution {
    Set<Integer> set=new HashSet<>();
    public int cuts(String s) {
        // code here
        set.add(1);
        for(long i=5;i<(long)1e9;i*=5)
            set.add((int)i);
        
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
            
        int ans = solve(s,0,dp);
                
        // System.out.println(ans);   
        
        return ans == Integer.MAX_VALUE? -1 : ans;
    }
    
    
    int solve(String s,int index,int[] dp){
        if(index>=s.length())
            return 0;
        
        int num = 0;
        if(dp[index]!=-1)
            return dp[index];
            
        int min=Integer.MAX_VALUE;
        
        if(s.charAt(index)=='0')
            return Integer.MAX_VALUE;
            
        for(int i=index;i<s.length();i++){
            num = num*2+(s.charAt(i)-'0');
            
            if(s.charAt(index)!='0' && set.contains(num))
            {
                int value = solve(s,i+1,dp);
                if(value != Integer.MAX_VALUE)
                    min=Math.min(min,1+value);
            }
        }
        
        return dp[index]=min;
    }

}

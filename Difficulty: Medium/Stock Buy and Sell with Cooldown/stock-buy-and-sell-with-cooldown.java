interface Stock{
    int solve(int index,int choice);
}

class Solution {
    
    public int maxProfit(int arr[]) {
        // Code here
        
        Stock[] s = new Stock[1];
        Integer[][] dp = new Integer[arr.length][2];
        
        
        s[0] = (index,choice) ->{
            if(index>=arr.length)
                return 0;
            
            if(dp[index][choice]!=null)
                return dp[index][choice];
                
            if(choice == 0){
                int nottake = s[0].solve(index+1,choice);
                int take = -arr[index] + s[0].solve(index+1,1);
                
                return dp[index][choice] = Math.max(take,nottake);
            }
            else{
                int nottake = s[0].solve(index+1,choice);
                int take = arr[index] + s[0].solve(index+2,0);
                
                return dp[index][choice] = Math.max(take,nottake);
            }
        };
        
        
        return s[0].solve(0,0);
    }
}

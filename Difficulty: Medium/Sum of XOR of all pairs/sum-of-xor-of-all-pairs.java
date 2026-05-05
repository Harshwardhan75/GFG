class Solution {
    public long sumXOR(int[] arr) {
        // code here
        long result = 0;
        
        for(int i=30;i>=0;i--){
            long set,unset;
            set = unset = 0;
            
            for(int x: arr){
                if((x&(1<<i))!=0)
                    set++;
                else
                    unset++;
            }
            
            result += (set * unset * (1l<<i)); 
        }
        
        return result;
    }
}
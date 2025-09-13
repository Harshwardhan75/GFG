class Solution {
    public int startStation(int[] gas, int[] cost) {
        // code here
        int g = Arrays.stream(gas).sum();
        int c = Arrays.stream(cost).sum();
        
        if(g<c)
            return -1;
        
        int left = 0;
        int right = 0;
        
        int sum = 0;
        
        while(right<gas.length){
            sum+=gas[right]-cost[right];
            
            while(sum<0){
                sum+=-gas[left]+cost[left];
                left++;
            }
            right++;
        }
        
        return left;
    }
}
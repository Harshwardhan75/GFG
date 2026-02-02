class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        boolean flag = true;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                flag = false;
                break;
            }
            max = Math.max(max,arr[i]);
        }
        
        if(flag)
            return max;
        
        int min;
        
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        
        int total,currMin,currMax;
        total = currMin = currMax = 0;
        
        for(int i=0;i<n;i++){
            total += arr[i];
            currMin += arr[i];
            currMax += arr[i];
            
            max = Math.max(max,currMax);
            min = Math.min(min,currMin);
            
            currMax = Math.max(0,currMax);
            currMin = Math.min(0,currMin);
        }
        
        return Math.max(max,total-min);
    }
}

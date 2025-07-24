class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int m=Integer.MIN_VALUE;
        boolean flag = true;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                flag = false;
                break;
            }
            m=Math.max(m,arr[i]);
        }
        
        if(flag)
            return m;
        
        int min =  100000000;
        int max = -100000000;
        
        int currmin = 0;
        int currmax = 0;
        int total = 0;
        
        for(int i=0;i<arr.length;i++){
            currmin+=arr[i];
            currmax+=arr[i];
            total += arr[i];
            
            max=Math.max(max,currmax);
            min=Math.min(min,currmin);
            
            currmin=Math.min(currmin,0);
            currmax=Math.max(currmax,0);
        }
        
        return Math.max(max,total-min);
    }
}

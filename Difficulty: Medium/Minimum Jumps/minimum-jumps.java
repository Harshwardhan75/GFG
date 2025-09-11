class Solution {
    public int minJumps(int[] arr) {
        // code here
        int jump = 0;
        int left = 0, right = 0;
        
        while(right<arr.length-1){
            int far = 0;
            
            for(int i=left;i<=right;i++){
                far = Math.max(far,i+arr[i]);
            }
            
            jump++;
            left = right+1;
            if(right==far)
                return -1;
            right = Math.min(arr.length-1,far);
        }
        
        return jump;
    }
}
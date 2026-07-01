class Solution {
    public int maxSumSubarray(int[] arr) {
        // code here
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            left[i] = sum;
            max = Math.max(max,left[i]);
            sum = Math.max(0,sum);
        }
        
        sum = 0;
        for(int i=n-1;i>=0;i--){
            sum+=arr[i];
            right[i] = sum;
            max = Math.max(max,right[i]);
            sum = Math.max(0,sum);
        }
        
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        // return 0;
        
        for(int i=1;i<n-1;i++)
            max = Math.max(max,left[i-1]+right[i+1]);
        
        return max;
    }
}
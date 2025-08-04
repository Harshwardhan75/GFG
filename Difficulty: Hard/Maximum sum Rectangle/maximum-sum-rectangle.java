class Solution {
    public int maxRectSum(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int max = Integer.MIN_VALUE;
        
        for(int start = 0;start<m;start++){
            int[] arr = new int[n];
            for(int end = start;end<m;end++){
                for(int i=0;i<n;i++)    {
                    arr[i]+=mat[i][end];
                }
                
                int sum = Kadane(arr);
                max = Math.max(max,sum);
            }
        }
        
        return max;
    }
    
    private int Kadane(int[] arr){
        int n=arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max = Math.max(max,sum);
            sum = Math.max(sum,0);
        }
        
        return max;
    }
};
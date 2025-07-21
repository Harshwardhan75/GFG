class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0 || arr[i]>n)
                arr[i]=0;
        }
        
        // System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<n;i++){
            int e=Math.abs(arr[i]);
            if (e >= 1 && e <= n){
                if(arr[e-1]>0)
                    arr[e-1]=-arr[e-1];
                else if(arr[e-1]==0)
                    arr[e-1]=-n-1;
            }
        }
        
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                return i+1;
            }
        }
        
        // System.out.println(Arrays.toString(arr));
        return n+1;
    }
}

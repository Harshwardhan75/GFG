class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(n==1)    return 0;
        Arrays.sort(arr);
        int difference=arr[n-1]-arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i]-k<0)  continue;
            int min=Math.min(arr[0]+k,arr[i]-k);
            int max=Math.max(arr[n-1]-k,arr[i-1]+k);
            difference=Math.min(difference,max-min);
        }
        return difference;
    }
}

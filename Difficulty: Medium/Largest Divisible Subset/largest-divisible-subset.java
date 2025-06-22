class Solution {
    public ArrayList<Integer> largestSubset(int[] arr) {
        // code here
        Arrays.sort(arr);
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int n=arr.length;
        int[] dp=new int[n];
        int[] hash=new int[n];
        int max = 0;
        int maxIndex=-1;
        int maxval=0;
        
        for(int i=0;i<n;i++){
            dp[i]=1;
            hash[i]=i;
            
            for(int j=i-1;j>=0;j--){
                if(dp[j]+1>dp[i] && arr[j]%arr[i]==0){
                    dp[i]=dp[j]+1;
                    hash[i]=j;
                }
                else if(dp[j]+1==dp[i] && arr[j]%arr[i]==0){
                    if(arr[j]>arr[hash[i]]){
                        hash[i]=j;
                    }
                }
            }
            
            if(dp[i]>max){
                max=dp[i];
                maxIndex=i;
                maxval=arr[i];
            }
            else if(dp[i]==max && arr[i]>maxval){
                maxval=arr[i];
                maxIndex=i;
            }
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        result.add(arr[maxIndex]);
        
        while(maxIndex!=hash[maxIndex]){
            maxIndex=hash[maxIndex];
            result.add(arr[maxIndex]);
        }
        
        return result;
    }
    

}
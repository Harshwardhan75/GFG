// User function Template for Java

class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int low = 0,high = 0;
        for(int i: arr){
            low=Math.max(low,i);
            high+=i;
        }
        
        
        while(low<=high){
            int mid=(low+high)>>1;
            
            int count = findCount(arr,mid);
            
            if(count<=k)
                high=mid-1;
            else
                low=mid+1;
        }
        
        return low;
    }
    
    int findCount(int[] arr,int cap){
        int curr=0;
        int count = 1;
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(curr+arr[i]<=cap)
                curr+=arr[i];
            else{
                count++;
                curr=arr[i];
            }
        }
        
        return count;
    }
}

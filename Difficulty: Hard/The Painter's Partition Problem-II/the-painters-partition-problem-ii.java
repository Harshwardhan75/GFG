// User function Template for Java

class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int low=0;
        int high=0;
        for(int i: arr){
            low=Math.max(low,i);
            high+=i;
        }
        
        while(low<=high){
            int mid=(low+high)>>1;
            
            if(possible(arr,mid)<=k)
                high=mid-1;
            else
                low=mid+1;
        }
        
        return low;
    }
    
    int possible(int[] arr,int mid){
        int current=1;
        int currentload=0;
        
        for(int i: arr){
            if(currentload+i>mid){
                current++;
                currentload=i;
            }    
            else
                currentload+=i;
        }
        
        return current;
    }
}

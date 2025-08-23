class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length)
            return -1;
            
        int low = 0 ;
        int high = 0;
        for(int i: arr){
            low = Math.max(low,i);
            high += i;
        }
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            int count = find(arr,mid);
            
            if(count>=k){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        return low;
    }
    
    int find(int[] arr,int pages){
    int count = 0;
        int load = 0;
        for(int i: arr){
            if(i+load<=pages){
                load+=i;
            }
            else{
                count++;
                load = i;
            }
        }
        
        return count;
    }
}
class Solution {
    public int minTime(int[] ranks, int n) {
        // code here
        long low = 0, high = 0;
        int nn = ranks.length;
        long total = ((long)n*(n+1))/2;
        
        for(int i=0;i<nn;i++){
            high = Math.max(high,total*ranks[i]);
        }
        
        while(low<=high){
            long mid = (low+high)>>1;
            
            if(possible(ranks,n,mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return (int) low;
    }
    
    boolean possible(int[] ranks,int n,long mid){
        int nn = ranks.length;
        int count = 0;
        
        for(int i=0;i<nn;i++){
            count += find(ranks[i],n,mid);
        }
        
        return count>=n;
    }
    
    int find(int value,int n,long mid){
        int low = 0, high = n;
        
        while(low<=high){
            int mm = (low+high)>>1;
            
            long total = (mm*(long)(mm+1))/2;
                
            total *= value;
                
            if(total<=mid)
                low = mm + 1;
            else
                high = mm - 1;
        }
        
        return high;
    }
}
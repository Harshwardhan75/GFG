class Solution {
    public int find(int[] arr) {
        // code here
        long low = 0l;
        long high = 1_000_000_000L;
        
        while(low<=high){
            long mid = low + (high-low)/2;
            
            if(possible(arr,mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        // System.out.println(low);
        
        return (int)low;
    }
    
    boolean possible(int[] arr,long value){
        // System.out.println(value);
        for(int i: arr){
            if(value>Integer.MAX_VALUE)
                value = Integer.MAX_VALUE;
                
            if(value>i){
                long diff = value - i;
                value = value + diff;
            }
            else{
                long diff = i - value;
                value = value - diff;
            }
            
            if(value<=0) return false;
        }
        
        return true;
    }
}

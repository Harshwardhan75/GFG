class Solution {
    public int kthSmallest(int n, int m, int k) {
        // code here
        int low = 1;
        int high = n*m;
        
        while(low<=high){
            int mid=(low+high)>>1;
            
            int smaller=findSmaller(n,m,mid);
            
            if(smaller<k)
                low=mid+1;
            else
                high=mid-1;
        }
        
        return low;
    }
    
    int findSmaller(int n,int m,int mid){
        int count = 0;
        
        for(int i=0;i<n;i++){
            count+=lower_bound(i+1,1,m,mid);
        }
        
        return count;
    }
    
    int lower_bound(int mul,int low,int high,int mid){
        while(low<=high){
            int newmid=(low+high)>>1;
            
            if(mul*newmid<=mid)
                low=newmid+1;
            else
                high=newmid-1;
        }
        
        return high;
    }
}
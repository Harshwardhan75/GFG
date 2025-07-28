// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length;
        int m=b.length;
        
        if(n>m)
            return kthElement(b,a,k);
        
        int low = Math.max(0,k-m);
        int high = Math.min(n,k);
        int left = k;
        
        while(low<=high){
            int mid1=(low+high)>>1;
            int mid2=left-mid1;
            
            int l1,l2,r1,r2;
            
            l1 = mid1>0?a[mid1-1]:Integer.MIN_VALUE;
            l2 = mid2>0?b[mid2-1]:Integer.MIN_VALUE;
            
            r1=mid1<n?a[mid1]:Integer.MAX_VALUE;
            r2=mid2<m?b[mid2]:Integer.MAX_VALUE;
            
            if(l1<=r2 && l2<=r1)
                return Math.max(l1,l2);
            
            if(l1>r2)
                high=mid1-1;
            else
                low=mid1+1;
        }
        
        return -1;
    }
}
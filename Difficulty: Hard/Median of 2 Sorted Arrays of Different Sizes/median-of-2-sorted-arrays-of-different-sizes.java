// User function Template for Java

class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int n=a.length;
        int m=b.length;
        
        if(n>m)
            return medianOf2(b,a);
        
        int low = 0;
        int high = n;
        int length = n+m;
        
        int left = (n+m+1)/2;
        
        while(low<=high){
            int mid1=(low+high)>>1;
            
            int mid2=left-mid1;
            
            int la=mid1==0?Integer.MIN_VALUE:a[mid1-1];
            int lb=mid2==0?Integer.MIN_VALUE:b[mid2-1];
            
            int ra=mid1==n?Integer.MAX_VALUE:a[mid1];
            int rb=mid2==m?Integer.MAX_VALUE:b[mid2];
            
            if(la<=rb && lb<=ra){
                if(length%2==1)
                    return (double)Math.max(la,lb);
                else
                    return (double)(Math.max(la,lb)+Math.min(ra,rb))/2.0;
            }
            
            if(la>rb){
                high=mid1-1;
            }
            else
                low=mid1+1;
        }
        
        return 0;
    }
}
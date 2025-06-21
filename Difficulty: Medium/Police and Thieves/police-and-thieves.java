class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int t=0;
        int p=0;
        int n=arr.length;
        
        int count = 0;
        
        while(t<n && p<n){
            while(p<n && arr[p]=='T')
                p++;
            while(t<n && arr[t]=='P')
                t++;
            
            while(t<n && p<n && arr[t]=='T' && arr[p]=='P' && Math.abs(t-p)<=k){
                count++;
                t++;
                p++;
            }
            

            while(Math.abs(t-p)>k){
                if(t<p)
                    t++;
                else
                    p++;
            }
            
        }
        
        return count;
    }
}
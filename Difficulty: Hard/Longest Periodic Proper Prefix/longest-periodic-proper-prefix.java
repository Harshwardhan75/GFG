class Solution {
    int getLongestPrefix(String s) {
        // code here
        int n=s.length();
        int low = 1,high = n-1;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(possible(s,mid))
                high = mid-1;
            else
                low=mid+1;
        }
        int max = Math.max(low,n-low);
        return max==n?-1:max;
    }
    
    boolean possible(String s,int mid){
        int n=s.length();
        
        StringBuilder sb = new StringBuilder();
        String str = s.substring(0,mid);
        
        while(sb.length()<=s.length())
            sb.append(str);
        
        return sb.toString().startsWith(s);
    }
}
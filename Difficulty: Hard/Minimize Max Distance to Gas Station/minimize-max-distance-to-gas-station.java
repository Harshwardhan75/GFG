// User function Template for Java

class Solution {
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        double low = 0;
        double high = 0;
        int n=stations.length;
        
        for(int i=1;i<n;i++){
            high = Math.max(high,stations[i]-stations[i-1]);    
        }
        
        double ans = 0;
        
        while(high-low>1e-6){
            double mid = (low+high)/2.0;
            
            int count = findCount(stations,mid);
            
            if(count<=k){
                // ans = mid;
                high = mid;
            }
            else
                low = mid;
        }
        
        return high;
    }
    
    static int findCount(int[] stations, double mid) {
    int count = 0;
    for (int i = 1; i < stations.length; i++) {
        double dist = stations[i] - stations[i - 1];
        count += (int)(dist / mid); // floor of number of extra stations needed
    }
    return count;
}
}

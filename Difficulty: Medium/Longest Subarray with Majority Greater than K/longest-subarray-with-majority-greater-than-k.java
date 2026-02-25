class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        int[] prefix = new int[n];
        int p = 0;
        
        for(int i=0;i<n;i++){
            p+=(arr[i]>k)?1:0;
            prefix[i] = p;
        }
        
        System.out.println("Prefix: "+Arrays.toString(prefix));
        
        int max = 0;
        for(int i=0;i<n;i++){
            int low = 0, high = i;
            int ans = high;
            
            while(low<=high){
                int mid = (low+high)>>1;
                int length = i - mid;
                int higher = prefix[i]-prefix[mid];
                int less = length-higher;
                System.out.println(i+" "+low+" "+mid+" "+high);
                
                if(higher>less){
                    ans = mid;
                    high = mid - 1;
                }
                else
                    low = mid + 1;
                
            }
            System.out.println(i+" "+low+" "+high);
            System.out.println();
            max = Math.max(max,i-high);
        }
        
        return max;
    }
}
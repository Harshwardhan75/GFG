class Solution {
    int minToggle(int[] arr) {
        // code here
        int n = arr.length;
        int rOne = Arrays.stream(arr).sum();
        int lOne = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<=n;i++){
            int lTotal = i;
            int rTotal = n - i;
            
            int lZero = lTotal - lOne;
            int rZero = rTotal - rOne;
            
            min = Math.min(min,lOne+rZero);
            
            if(i<n && arr[i]==1){
                rOne--;
                lOne++;
            }
        }
        
        return min;
    }
}
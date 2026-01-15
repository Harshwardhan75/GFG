class Solution {
    public int minCandy(int arr[]) {
        // code here
        int ans = 1;
        int i = 1, n = arr.length;
        
        while(i<n){
            if(arr[i-1]==arr[i]){
                ans++;
                i++;
                continue;
            }
            
            int peak = 1;
            
            while(i<n && arr[i-1]<arr[i]){
                peak++;
                ans+=peak;
                i++;
            }
            
            int down = 1;
            while(i<n && arr[i-1]>arr[i]){
                ans += down;
                down++;
                i++;
            }
            // down--;
            
            if(down>peak)
                ans = ans - peak + down;
        }
        
        return ans;
    }
}

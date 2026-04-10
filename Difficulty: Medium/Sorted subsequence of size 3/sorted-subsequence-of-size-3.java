class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        // code here
        int n = arr.length;
        
        int[] min = new int[n];
        
        int m = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            min[i] = m;
            m = Math.min(m,arr[i]);
        }
        
        int mx = Integer.MIN_VALUE;
        
        for(int i=n-1;i>=0;i--){
            if(min[i]<arr[i] && arr[i]<mx)
                return new ArrayList<>(Arrays.asList(min[i],arr[i],mx));
            
            mx = Math.max(mx,arr[i]);
        }
        
        return new ArrayList<>();
    }
}
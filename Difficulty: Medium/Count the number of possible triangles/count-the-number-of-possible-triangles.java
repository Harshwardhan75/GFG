class Solution {
    public int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int n = arr.length;
        int count = 0;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int index = find(arr,j+1,n-1,arr[i]+arr[j]);
                count+= index-(j+1);
            }
        }
        
        return count;
    }
    
    int find(int[] arr,int low,int high,int sum){
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(arr[mid]>=sum){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return low;
    }
}
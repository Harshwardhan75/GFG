class Solution {
    public int countRevPairs(int[] arr) {
        // code here
        return  mergeSort(arr,0,arr.length-1);
    }
    
    int mergeSort(int[] arr,int low,int high){
        if(low>=high)
            return 0;
        
        int count = 0;
        int mid = (low+high)>>1;
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=find(arr,low,mid,high);
        merge(arr,low,mid,high);
        
        return count;
    }
    
    int find(int[] arr,int low,int mid,int high){
        int i = low, j = mid + 1;
        
        int count = 0;
        
        for(i=i;i<=mid;i++){
            while(j<=high && arr[i]>arr[j]*2)
                j++;
            
            count = count + j-1-mid;
        }
        
        return count;
    }
    
    void merge(int[] arr,int low,int mid,int right){
        int i = low, j = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        
        while(i<=mid)   temp.add(arr[i++]);
        while(j<=right)   temp.add(arr[j++]);
        
        for(i=0;i<temp.size();i++){
            arr[low+i]=temp.get(i);
        }
    }
}
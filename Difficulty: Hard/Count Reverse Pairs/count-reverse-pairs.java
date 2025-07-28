class Solution {
    public int countRevPairs(int[] arr) {
        // code here
        return mergeSort(arr,0,arr.length-1);
    }
    
    int mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid=(low+high)>>1;
            
            int count = 0;
            
            count+=mergeSort(arr,low,mid);
            count+=mergeSort(arr,mid+1,high);
            count += count(arr,low,mid,high);
            
            merge(arr,low,mid,high);
            
            return count;
        }
        
        return 0;
    }
    
    void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=low,j=mid+1;
        
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        
        while(i<=mid)  temp.add(arr[i++]);
        while(j<=high)  temp.add(arr[j++]);
        
        for(i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    
    int count(int[] arr,int low,int mid,int high){
        int count = 0;
        int right = mid+1;
        
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>arr[right]*2)
                right++;
            
            count+=(right-(mid+1));
        }
        
        return count;
    }
}
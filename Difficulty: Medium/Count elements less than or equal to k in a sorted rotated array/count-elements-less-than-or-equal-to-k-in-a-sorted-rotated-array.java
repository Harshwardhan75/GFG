class Solution {
    int findIndex(int[] arr){
        int low = 0, high = arr.length-1;
        int index = -1;
        int min = Integer.MAX_VALUE;
        
        while(low<=high){
            int mid = (low + high)>>1;
            
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                if(arr[low]<min){
                    min = arr[low];
                    index = low;
                }
                low ++;
                high -- ;
                continue;
            }
            
            if(arr[low]<=arr[mid]){
                if(arr[low]<min){
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            }
            else{
                if(arr[mid]<min){
                    min = arr[low];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        
        return index;
    }
    public int countLessEqual(int[] arr, int x) {
        // code here
        int index = findIndex(arr);
        // System.out.println(index);
        
        int a = find(arr,0,index-1,x);
        int b = find(arr,index,arr.length-1,x);
        
        return a+b;
    }
    
    int find(int[] arr,int low,int high,int target){
        int first = low;
        while(low<=high){
            int mid = (low + high)>>1;
            
            if(arr[mid]<=target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return high - first + 1;
    }
}

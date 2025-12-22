// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int max = 0;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            int low = 0, high = arr[0].length-1;
            
            while(low<=high){
                int mid = (low+high)>>1;
                if(arr[i][mid]==0)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            
            if(arr[0].length-low>max){
                max = arr[0].length-low;
                index = i;
            }
        }
        
        return index;
    }
}
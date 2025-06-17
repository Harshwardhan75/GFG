class Solution {
    public static void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        int[] temp=arr.clone();
        int low = 0 ;
        int high = arr.length-1;
        int index=0;
        
        while(low<=high){
            if(index<arr.length){
                temp[index++]=arr[high--];
            }    
            
            if(index<arr.length){
                temp[index++]=arr[low++];
            }    
        }
        
        for(int i=0;i<arr.length;i++)
            arr[i]=temp[i];
    }
}

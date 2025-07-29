class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int LOG = 17;
        int n=arr.length;
        int x= 0;
        
        for(int i=LOG;i>=0;i--){
            int index = 1<<i;
            if(x+index<n && arr[x+index]<k){
                // if(arr[x+index]==k)
                //     return x+index;
                x+=index;
            }
        }
        
        if(x+1<n && (arr[x+1]==k || arr[x]==k)){
            // System.out.println("Hello");
            return arr[x]==k?x:x+1;
        }
        
        return -1;
    }
}
// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first = findFirst(arr,x);
        if(x==-1)
            return new ArrayList<>(Arrays.asList(-1,-1));
        
        int last = findLast(arr,x);
        return new ArrayList<>(Arrays.asList(first,last));
    }
    
    static int findFirst(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid=(low+high)>>1;
            if(arr[mid]==x){
                ans=mid;
                high=mid-1;
            }
            else
            if(arr[mid]>x){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
    
    static int findLast(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid=(low+high)>>1;
            if(arr[mid]==x){
                ans=mid;
                low=mid+1;
            }
            else
            if(arr[mid]>x){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
}

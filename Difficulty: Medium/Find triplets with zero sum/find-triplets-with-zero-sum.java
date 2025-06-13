/*Complete the function below*/

class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
        // code here.
        Arrays.sort(arr);
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            
            
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0)
                    return true;
                
                if(sum<0)
                    j++;
                else
                    k--;
            }
        }
        
        return false;
    }
}
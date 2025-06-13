// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        
        int index=0;
        
        int n=arr.length;
        int max = 0;
        
        while(index<n){
            int sum = 0;
            ArrayList<Integer> temp=new ArrayList<>();
            
            while(index<n && arr[index]>=0){
                sum+=arr[index];
                temp.add(arr[index]);
                index++;
            }
            
            if(sum>max){
                max=sum;
                result=temp;
            }
            
            while(index<n && arr[index]<0)
                index++;
        }
        
        if(result.size()==0)
            result.add(-1);
        
        return result;
    }
}
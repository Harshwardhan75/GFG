

// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=0;
        for(j=0;j<arr.length;j++)
            if(arr[j]==0)
                break;
            
        for(int i=j+1;i<arr.length;i++)
            if(arr[i]!=0){
                arr[j]=arr[i];
                arr[i]=0;
                j++;
            }
    }
}
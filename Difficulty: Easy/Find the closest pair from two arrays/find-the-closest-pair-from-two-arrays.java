class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        int n = arr1.length;
        int m = arr2.length;
        
        int i = 0, j = m-1;
        
        int closest = Integer.MAX_VALUE;
        int a=0,b=0;
        
        while(i<n && j>=0){
            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(x-sum);
            
            if(diff<closest){
                closest = diff;
                a  = arr1[i];
                b  = arr2[j];
            }
            
            if(sum<x){
                i++;
            }
            else{
                j--;
            }
        }
        
        return new ArrayList<>(Arrays.asList(a,b));
    }
}
class Solution {
    public boolean isMaxHeap(int[] arr) {
        // code here
        return solve(0,arr);
    }
    
    boolean solve(int index,int[] arr){
        if(index>=arr.length)
            return true;
        
        int left = 2*index+1<arr.length?arr[2*index+1]:Integer.MIN_VALUE;
        int right = 2*index+2<arr.length?arr[2*index+2]:Integer.MIN_VALUE;
        
        if(left>arr[index] || right>arr[index])
            return false;
        
        return solve(2*index+1,arr) & solve(2*index+2,arr);
        
    }
}
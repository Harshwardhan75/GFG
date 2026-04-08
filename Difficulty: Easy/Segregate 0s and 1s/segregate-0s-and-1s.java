class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int one = Arrays.stream(arr).sum();
        int zero = arr.length - one;
        
        for(int i=0;i<arr.length;i++){
            if(zero>0){
                zero--;
                arr[i]=0;
            }
            else{
                arr[i] = 1;
            }
        }
    }
}

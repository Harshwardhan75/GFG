class Solution {
    public int coin(int[] arr) {
        // code here
        int l = 0, r = arr.length-1;
        
        while(l<r){
            if(arr[l]>=arr[r])
                l++;
            else
                r--;
        }
        
        return arr[l];
    }
}
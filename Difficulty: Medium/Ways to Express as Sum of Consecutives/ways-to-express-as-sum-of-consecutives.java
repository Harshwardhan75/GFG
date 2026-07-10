class Solution {
    public int getCount(int n) {
        // code here
        int count=0, i=3;
        
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i += 2;
        }
        
        return count;
    }
};
class Solution {
    int lcmTriplets(int n) {
        // code here
        if(n==2)
            return 2;
        
        if(n%2==0 && n%3==0 && (n-3)%3==0)
            return (n-1)*(n-2)*(n-3);
        
        if(n%2==0)
            return n*(n-1)*(n-3);
        
        return n*(n-1)*(n-2);
    }
}
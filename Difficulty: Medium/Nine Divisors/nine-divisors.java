class Solution {

    public static int count(int n){
        int i=2,ans = 3, num = n*n;
        
        for(int j=i;j<n;j++){
            if(num%j==0)    ans+=2;
            if(ans>9)
                return ans;
        }
        
        return ans;
    }

    public static int countNumbers(int n) {
        // code here
        if(n<36)
            return 0;
        
        int count = 0;
        
        for(int i=6;(i*i)<=n;i++){
            if(count(i)==9)
                count++;
        }
        
        return count;
    }
}
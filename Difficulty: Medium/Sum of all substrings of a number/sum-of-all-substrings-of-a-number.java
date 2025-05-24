class Solution {
    public static int sumSubstrings(String s) {
        // code here
        int n=s.length();
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                sum+=Integer.parseInt(s.substring(i,j));
            }
        }
        return sum;
    }
}
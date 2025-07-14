class Solution {
    public boolean divby13(String s) {
        // code here
        int rem = 0;
        
        for(char c: s.toCharArray()){
            int digit = c-'0';
            rem = (rem*10+digit)%13;
        }
        
        return rem==0;
    }
}
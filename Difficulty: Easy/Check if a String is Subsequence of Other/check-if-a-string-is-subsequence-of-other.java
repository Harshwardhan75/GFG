class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int first = 0, second = 0;
        
        while(first<s1.length() && second<s2.length()){
            if(s1.charAt(first)==s2.charAt(second)){
                first++;
                second++;
            }
            else{
                second++;
            }

        }
        
        return first==s1.length();
    }
};
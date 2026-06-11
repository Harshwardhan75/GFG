class Solution {
    public int findIndex(String s) {
        // code here
        int closing = 0;
        for(char c: s.toCharArray())
            if(c==')')
                closing++;
            
        if(closing == s.length())
            return s.length();
            
        int index=0;
        int opening = 0;
        for(char c: s.toCharArray()){

            if(opening == closing)
                return index;
            
            index++;
            if(c==')')
                closing--;
            else
                opening++;
        }
        
        return -1;
    }
}
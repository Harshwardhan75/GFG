class Solution {
    public boolean isPalinSent(String s) {
        // code here
        s = s.toLowerCase();
        int j = s.length()-1;
        int i = 0;
        
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i)))
                    i++;
                    
            while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
                    j--;
            
            if(i<j && s.charAt(i)!=s.charAt(j))
                return false;
            
            i++;
            j--;
        }
        
        return true;
    }
}
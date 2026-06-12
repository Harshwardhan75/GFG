class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        int n = s.length();
        
        if(n%k!=0)
            return false;
        
        if(check(s,s.substring(0,k)))
            return true;
        
        if(check(s,s.substring(s.length()-k,s.length())))
            return true;
        
        return false;
    }
    
    boolean check(String s,String match){
        int count = 0;
        for(int i=0;i<s.length();i+=match.length()){
            
            for(int j=0;j<match.length();j++){
                if(s.charAt(i+j)!=match.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        
        return count<=1;
    }
}
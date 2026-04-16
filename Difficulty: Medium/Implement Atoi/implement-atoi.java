class Solution {
    public int myAtoi(String s) {
        // code here
        long value = 0;
        int index = 0;
        int n = s.length();
        
        while(index<n && s.charAt(index)==' ')  index++;
        
        if(index>=n)
            return 0;
        
        if((s.charAt(index)<'0' || s.charAt(index)>'9') && 
            (s.charAt(index)=='+' && s.charAt(index)=='-'))
            return 0;
        
        boolean negative = s.charAt(index)=='-'?true:false;
        
        if(s.charAt(index)=='+' || s.charAt(index)=='-')
            index++;
        
        while(index<n && s.charAt(index)>='0' && s.charAt(index)<='9'){
            value = (value*10) + (s.charAt(index)-'0');
            index++;
            
            if(value>Integer.MAX_VALUE)
                return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
        
        if(value==0)
            return 0;
        
        return negative?-(int)value:(int)value;
    }
}
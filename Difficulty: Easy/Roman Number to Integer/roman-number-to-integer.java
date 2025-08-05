class Solution {
    
    int getValue(char c){
        if(c=='I')  return 1;
        if(c=='V')  return 5;
        if(c=='X')  return 10;
        if(c=='L')  return 50;
        if(c=='C')  return 100;
        if(c=='D')  return 500;
        if(c=='M')  return 1000;
        
        return 0;
    }
    
    public int romanToDecimal(String s) {
        // code here
        int n = s.length();
        int value = 0;
        
        for(int i=0;i<n-1;i++){
            if(getValue(s.charAt(i))<getValue(s.charAt(i+1))){
                value-=getValue(s.charAt(i));
            }
            else{
                value+=getValue(s.charAt(i));
            }
        }
        
        value += getValue(s.charAt(n-1));
        return value;
    }
}
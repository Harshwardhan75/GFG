class Solution {
    public int countPS(String s) {
        // code here
        int count = 0;
        
        int n=s.length();
        
        for(int i=0;i<n;i++){
            count+=find(i,i+1,s);
            count+=find(i-1,i+1,s);
        }
        
        return count;
    }
    
    int find(int left,int right,String s){
        if(left<0 || right>=s.length())
            return 0;
        
        if(s.charAt(left)!=s.charAt(right))
            return 0;
        
        return 1 + find(left-1,right+1,s);
    }
}
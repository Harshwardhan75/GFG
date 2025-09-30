class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        
        for(int i=0;i<(1<<n);i++){
            StringBuilder s = new StringBuilder();
            
            for(int j = n-1;j>=0;j--){
                if((i&(1<<j))!=0)
                    s.append("1");
                else
                    s.append("0");
            }
            
            result.add(s.toString());
        }
        
        return result;
    }
}

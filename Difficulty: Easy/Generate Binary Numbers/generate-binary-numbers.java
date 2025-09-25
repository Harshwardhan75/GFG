class Solution {
    interface solve{
        String a(int i);
    }
    
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        
        solve a = x ->{
            StringBuilder res = new StringBuilder();
            
            while(x>0){
                int rem = x%2;
                x/=2;
                res.append(rem);
            }
            
            return res.reverse().toString();
        };
        
        for(int i=1;i<=n;i++)
            result.add(a.a(i));
        
        return result;
    }
}

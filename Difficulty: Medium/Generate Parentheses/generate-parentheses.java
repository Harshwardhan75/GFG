// User function Template for Java

class Solution {

    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> result=new ArrayList<>();
        solve(0,0,"",result,n);
        return result;
    }
    
    void solve(int maxOpen,int maxClose,String s,ArrayList<String> result,int n){
        if(s.length()==n){
            result.add(s);
            return;
        }
        
        
        //add opens
        if(maxOpen<n/2)
            solve(maxOpen+1,maxClose,s+"(",result,n);
        
        if(maxClose<maxOpen)
            solve(maxOpen,maxClose+1,s+")",result,n);
        
    }
}
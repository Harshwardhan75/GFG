class Solution {
    int min;
    Set<String> result;
    public List<String> validParenthesis(String s) {
        // code here
        this.min = findMin(s);
        this.result = new HashSet<>();
        generate(s,0,0,0,"");
        
        List<String> temp = new ArrayList<>(result);
        Collections.sort(temp);
        return temp;
    }
    
    void generate(String s,int index,int value,int removal,String res){
        if(value<0)
            return;
            
        if(index>=s.length()){
            if(value==0 && removal==min)
                result.add(res);
            
            return;
        }
        
        if(!"()".contains(s.charAt(index)+"")){
            generate(s,index+1,value,removal,res+s.charAt(index));
            return;
        }
        generate(s,index+1,value+(s.charAt(index)=='('?1:-1),removal,res+s.charAt(index));
        generate(s,index+1,value,removal+1,res);
    }
    
    int findMin(String s){
        return solve(s,0,0,0);
    }
    
    int solve(String s,int index,int value,int removal){
        if(value<0)
            return Integer.MAX_VALUE;
            
        if(index>=s.length()){
            return value == 0?removal:Integer.MAX_VALUE;
        }
        
        if(!"()".contains(s.charAt(index)+""))
            return solve(s,index+1,value,removal);
        
        int nt = solve(s,index+1,value + (s.charAt(index)=='('?1:-1),removal);
        int t = solve(s,index+1,value,removal+1);
        
        return Math.min(t,nt);
    }
}
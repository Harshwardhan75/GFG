class Solution {
    ArrayList<String> result;
    public ArrayList<String> findExpr(String s, int target) {
        // code here
        result = new ArrayList<>();
        solve(s.toCharArray(),0,target,"");
        return result;
    }
    
    private ArrayList<String> convertPostfix(String s){
        Stack<Character> st = new Stack<>();
        ArrayList<String> result = new ArrayList<>();
        
        int i = 0, n = s.length();
        
        while(i<n){
            String val = "";
            
            while(i<n && Character.isDigit(s.charAt(i))){
                val += s.charAt(i);
                i++;
            }
            result.add(val);
            char op = i<n?s.charAt(i++):' ';
            if(op==' ')
                break;
            
            if(op=='-' || op=='+'){
                while(!st.isEmpty())
                {
                    result.add(st.pop()+"");
                }
                st.push(op);
            }
            else{
                st.push(op);
            }
        }
        while(!st.isEmpty())
            result.add(st.pop()+"");
        // System.out.println(result);
        return result;
    }
    
    private boolean evaluate(String s,int target){
        int n = s.length();
        ArrayList<String> p = convertPostfix(s);
        
        Stack<Integer> st = new Stack<>();
        
        for(String xx: p){
            if(xx.length()==1 && "-+*".contains(xx.charAt(0)+"")){
                int b = st.pop();
                int a = st.pop();
                
                if(xx.charAt(0)=='-')   st.push(a-b);
                if(xx.charAt(0)=='+')   st.push(a+b);
                if(xx.charAt(0)=='*')   st.push(a*b);
            }
            else{
                st.push(Integer.parseInt(xx));
            }
        }
        
        return st.peek()==target;
    }
    
    private void solve(char[] c,int index,int target,String res){
        if(index>=c.length){
            if(evaluate(res,target))
                result.add(res);
            return;
        }
        
        String temp = "";
        
        for(int i=index;i<c.length;i++){
            temp += c[i];
            int val = Integer.parseInt(temp);
            
            if (temp.length() > 1 && temp.charAt(0) == '0') break;
            
            if(index==0){
                solve(c,i+1,target,temp);
            }
            else{
                solve(c,i+1,target,res+"+"+temp);
                solve(c,i+1,target,res+"-"+temp);
                solve(c,i+1,target,res+"*"+temp);
            }
        }
    }
}
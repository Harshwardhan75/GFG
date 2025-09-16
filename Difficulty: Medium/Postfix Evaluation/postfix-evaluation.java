class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        for(String s: arr){
            if(check(s)){
                int b = st.pop();
                int a = st.pop();
                int c = 0;
                
                switch(s.charAt(0)){
                    case '+':
                        c = a+b;
                        break;
                    case '-':
                        c = a-b;
                        break;
                    case '*':
                        c = a * b;
                        break;
                    case '/':
                        c = (int)Math.floor((double)a / b);
                        break;
                    case '^':
                        c = (int)Math.pow(a,b);
                        break;
                }

                st.push(c);
            }
            else{
                st.push(Integer.parseInt(s));
            }
            
            // System.out.println(st);
        }
        
        return st.peek();
    }
    
    boolean check(String s){
        if(s.length()>1)
            return false;
        
        return ("+-*^/".contains(s));
    }
}
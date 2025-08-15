// User function Template for Java
class StackQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public void push(int B) {
        // code here
        st1.push(B);
    }

    public int pop() {
        // code here
        if(st1.isEmpty())
            return -1;
            
        while(!st1.isEmpty())
            st2.push(st1.pop());        
        
        int result = st2.pop();
        
        while(!st2.isEmpty())
            st1.push(st2.pop());
        
        return result;
    }
}
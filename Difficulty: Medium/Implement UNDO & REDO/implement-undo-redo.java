class Solution {
    StringBuilder sb = new StringBuilder();
    Stack<Character> st = new Stack<>();
    
    public void append(char x) {
        // append x into document
        sb.append(x);
    }

    public void undo() {
        // undo last change
        int last = sb.length()-1;
        st.push(sb.charAt(last));
        sb.deleteCharAt(last);
    }

    public void redo() {
        // redo changes
        sb.append(st.pop());
    }

    public String read() {
        // read the document
        return sb.toString();
    }
}

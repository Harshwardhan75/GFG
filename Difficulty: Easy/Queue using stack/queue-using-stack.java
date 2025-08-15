class Queue {
    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();

    int dequeue() {
        // code here
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        if(output.isEmpty())
            return -1;
            
        return output.pop();
    }

    void enqueue(int x) {
        // code here
        input.push(x);
    }
}

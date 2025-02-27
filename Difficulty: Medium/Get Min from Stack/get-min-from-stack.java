//{ Driver Code Starts
import java.util.*;

class Get_Min_From_Stack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int q = sc.nextInt(); // Number of queries
            Solution g = new Solution();

            while (q-- > 0) {
                int qt = sc.nextInt();

                if (qt == 1) {
                    int att = sc.nextInt();
                    g.push(att);
                } else if (qt == 2) {
                    g.pop(); // Just call pop(), do not print anything
                } else if (qt == 3) {
                    System.out.print(g.peek() + " "); // Print top element
                } else if (qt == 4) {
                    System.out.print(g.getMin() + " "); // Print minimum element
                }
            }
            System.out.println("\n~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    ArrayList<int[]> arr;
    int top=-1;
    public Solution() {
        arr=new ArrayList<>();
    }

    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        if(top==-1){
            arr.add(new int[]{x,x});
        }
        else{
            arr.add(new int[]{x,Math.min(x,arr.get(top)[1])});    
        }
        top++;
    }

    // Remove the top element from the Stack
    public void pop() {
        // code here
        if(top==-1) return ;
        arr.remove(top);
        top--;
    }

    // Returns top element of the Stack
    public int peek() {
        // code here
        if(top==-1) return -1;
        return arr.get(top)[0];
    }

    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if(top==-1) return -1;
        return arr.get(top)[1];
    }
}
class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        if(type == 1){
            while(k-->0){
                dq.offerFirst(dq.pollLast());
            }
        }
        else{
            while(k-->0){
                dq.offerLast(dq.pollFirst());
            }
        }
    }
}
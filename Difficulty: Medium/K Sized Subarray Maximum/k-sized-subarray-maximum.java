class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && (i-dq.peekFirst())>=k)
                dq.pollFirst();
            
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i])
                dq.pollLast();
            
            dq.offerLast(i);
            
            // System.out.println(i+" "+dq);
            
            if(i>=k-1)
                result.add(arr[dq.peekFirst()]);
        }
        
        return result;
    }
}
class Solution {
    public int minSteps(int[] arr, int start, int end) {
        // code here
        int MOD = 1_000;
        
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        Set<Integer> set = new HashSet<>();
        set.add(start);
        
        int level = 0;
        
        while(!que.isEmpty()){
            int size = que.size();
            
            for(int i=1;i<=size;i++){
                int node = que.poll();
                
                if(node==end)
                    return level;
                
                for(int j: arr)
                {
                    int val = (j*node)%MOD;
                    if(!set.contains(val)){
                        set.add(val);
                        que.offer(val);
                    }
                }
            }
            
            level++;
        }
        
        return -1;
    }
}
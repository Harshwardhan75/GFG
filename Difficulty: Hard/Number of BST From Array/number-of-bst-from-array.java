class Solution {
    public ArrayList<Integer> countBSTs(int[] arr) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int count = solve(arr,Integer.MIN_VALUE,arr[i]) 
                * solve(arr,arr[i],Integer.MAX_VALUE);
                
            result.add(count);
        }
        
        return result;
    }
    
    int solve(int[] arr,int lb,int ub){
        if(lb>=ub)
            return 1;
        
        int count = 0;
        
        for(int i: arr){
            if(lb<i && i<ub){
                int val = solve(arr,lb,i) *
                            solve(arr,i,ub);
                count+=val;
            }
        }
        
        return count==0?1:count;
    }
}
class Solution {
    int[] arr;
    // int[][] dp;
    Map<String,Integer> map = new HashMap<>();
    public int totalWays(int[] arr, int target) {
        // code here
        this.arr = arr;
        // this.dp = new int[arr.length][50000+1];
        // for(int[] i: )
        return solve(0,target);
    }
    
    int solve(int index,int target){
        if(index>=arr.length)
            return target==0?1:0;
        String key= index+" "+target;
        if(map.containsKey(key))
            return map.get(key);
        int p = solve(index+1,target+arr[index]);
        int n = solve(index+1,target-arr[index]);
        map.put(key,p+n);
        return p + n;
    }
}
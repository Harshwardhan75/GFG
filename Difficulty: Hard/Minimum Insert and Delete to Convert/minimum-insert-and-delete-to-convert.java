class Solution {
    int[] a;
    int[] b;
    int n;
    int m;
    int[][] dp;
    public int minInsAndDel(int[] a, int[] b) {
        // code here
        this.a = a;
        this.b = b;
        this.n = a.length;
        this.m = b.length;
        // this.dp = new int[n][m];
        // for(int[] i: dp)
        //     Arrays.fill(i,-1);
        
        
        Set<Integer> set = new HashSet<>();
        for(int i: b)   set.add(i);
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i: a){
            if(!set.contains(i))    continue;
            
            if(arr.isEmpty() || arr.get(arr.size()-1)<i)
                arr.add(i);
            else{
                arr.set(find(arr,i),i);
            }
        }
        
        return (n - arr.size()) + (m-arr.size());
    }
    
    int find(ArrayList<Integer> arr,int value){
        int low = 0, high = arr.size()-1;
        
        while(low<=high){
            int mid = (low+high)>>1;
            
            if(arr.get(mid)<value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return low;
    }
    
    int solve(int index,int jndex){
        if(index>=n){
            return (m - jndex);
        }
        
        if(jndex>=m)
            return (n - index);
        
        if(dp[index][jndex]!=-1)
            return dp[index][jndex];
        
        int min = Integer.MAX_VALUE;
        
        // noOp
        if(a[index]==b[jndex])
            min = Math.min(min,solve(index+1,jndex+1));
        
        // Insert, Delete
        min = Math.min(min,1 + Math.min(solve(index,jndex+1),solve(index+1,jndex)));
    
        return dp[index][jndex] = min;
    }
}

/*
    if(prevOp == -1){
                int low = 0, high = m - 1;
                while(low<=high){
                    int mid = (low+high)>>1;
                    if(b[mid]<a[index-1])
                        low = mid + 1;
                    else
                        high = mid - 1;
                }
                
                low ++;
                return m - low;
            }
            
            return 
*/
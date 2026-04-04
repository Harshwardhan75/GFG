class Solution {
    int n;
    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<String> graycode(int n) {
        // code here
        this.n = n;
        solve(0,new HashSet<>());
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i: result){
            String s = "";
            for(int j=n-1;j>=0;j--){
                s += (i&(1<<j))==0?'0':'1';
            }
            
            ans.add(s);
        }
        return ans;
    }
    
    boolean solve(int prev,Set<Integer> set){
        set.add(prev);
        result.add(prev);
        
        if(set.size()==1<<n)
            return true;
        
        for(int i=0;i<16;i++){
            int value = prev ^ (1<<i);
            if(!set.contains(value)){
                if(solve(value,set))
                    return true;
            }
        }
        
        set.remove(prev);
        result.remove(result.size()-1);
        return false;
    }
}
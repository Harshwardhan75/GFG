class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(1,n,k,result,new ArrayList<>());
        return result;
    }
    
    void solve(int val,int n,int k,ArrayList<ArrayList<Integer>> result,
        ArrayList<Integer> temp){
        if(k==0){
            if(n==0){
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        
        for(int i=val;i<=Math.min(n,9);i++){
            temp.add(i);
            solve(i+1,n-i,k-1,result,temp);
            temp.remove(temp.size()-1);
        }
    }
}
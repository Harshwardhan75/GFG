// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] nums) {
        // code here
        int n=nums.length;
        boolean[] visited=new boolean[n];
        Arrays.sort(nums);
        
        Set<ArrayList<Integer>> result=new HashSet<>();
        solve(result,new ArrayList<>(),nums,visited);
        ArrayList<ArrayList<Integer>> val = new ArrayList<>(result);
        Collections.sort(val,(a,b)->{
            for(int i=0;i<n;i++){
                if(a.get(i)==b.get(i))
                    continue;
                
                return a.get(i)-b.get(i);
            }
            
            return 0;
        });
        return val;
    }
    
    static void solve(Set<ArrayList<Integer>> result,ArrayList<Integer> temp,
                int[] nums,boolean[] visited){
        
        int n=nums.length;
        if(temp.size()>=n)    {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                temp.add(nums[i]);
                visited[i]=true;
                solve(result,temp,nums,visited);
                visited[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
};
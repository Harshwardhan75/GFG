class Solution {
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        // code here
        Set<ArrayList<Integer>> set = new HashSet<>();
        int n = arr.length;
        solve(set,arr,new boolean[n],new ArrayList<>());
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(set);
        Collections.sort(result,(a,b)->{
            int nn = a.size();
            
            for(int i=0;i<nn;i++){
                if(a.get(i)<b.get(i))
                    return -1;
                else
                if(a.get(i)>b.get(i))
                    return 1;
            }
            
            return 0;
        });
        
        return result;
    }
    
    static void solve(Set<ArrayList<Integer>> set,int[] arr,
                    boolean[] visited,ArrayList<Integer> temp){
        if(temp.size()==arr.length){
            set.add(new ArrayList<>(temp));
            return;
        }          
        
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                visited[i] = true;
                temp.add(arr[i]);
                solve(set,arr,visited,temp);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }
};
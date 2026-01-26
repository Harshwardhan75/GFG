class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        int n = arr.length;
        boolean[] visited = new boolean[n];
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(result,new ArrayList<>(),arr,visited);
        return result;
    }
    
    static void solve(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> temp,
        int[] arr,boolean[] visited){
            if(temp.size()==arr.length){
                result.add(new ArrayList<>(temp));
                return;
            }
            
            for(int i=0;i<arr.length;i++){
                if(!visited[i]){
                    visited[i] = true;
                    temp.add(arr[i]);
                    solve(result,temp,arr,visited);
                    temp.remove(temp.size()-1);
                    visited[i] = false;
                }
            }
        }
};
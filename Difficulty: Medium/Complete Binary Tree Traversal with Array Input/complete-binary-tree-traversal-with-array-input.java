class Solution {
    public ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        int i = 0;
        int level = 0;
        
        while(i<arr.length){
            int nodes = 1<<level;
            level++;
            result.add(new ArrayList<>());
            
            while(nodes-->0 && i<arr.length){
                result.get(result.size()-1).add(arr[i]);
                i++;
            }
            
            Collections.sort(result.get(result.size()-1));
        }
        
        return result;
    }
}
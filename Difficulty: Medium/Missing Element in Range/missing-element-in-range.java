class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i: arr)
            set.add(i);
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=low;i<=high;i++){
            if(!set.contains(i))    
                result.add(i);
        }
        
        return result;
    }
}
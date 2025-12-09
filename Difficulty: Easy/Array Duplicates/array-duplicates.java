class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i])
                result.add(arr[i]);
        }
        
        return result;
    }
}
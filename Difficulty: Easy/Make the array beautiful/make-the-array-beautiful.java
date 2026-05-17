class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        // code here
        List<Integer> result = new ArrayList<>();
        
        for(int i: arr){
            int size = result.size();
            if(result.isEmpty() || (result.get(size-1)>=0 && i>=0) || 
                    (result.get(size-1)<0 && i<0))
                result.add(i);
            else{
                result.remove(size-1);
            }
        }
        
        return result;
    }
}
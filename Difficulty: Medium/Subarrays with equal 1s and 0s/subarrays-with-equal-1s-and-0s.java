// User function Template for Java

class Solution {
    // Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        // add your code here
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count = 0;
        int prefix = 0;
        
        for(int i: arr){
            prefix+=(i==1?1:-1);
            if(map.containsKey(prefix))
                count+=map.get(prefix);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        
        return count;
    }
}

class Solution {
    public static ArrayList<Integer> subsetXOR(int n) {
        // code here
        int xor = 0;
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            xor ^= i;
            result.add(i);
        }
        
        int rem = xor ^ n;
        if(rem!=0)
            result.remove(rem-1);
        
        return result;
    }
}

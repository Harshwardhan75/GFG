class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int[] prefix = new int[queries.length+1];
        result.add(0);
        for(int[] q: queries){
            if(q[0]==0){
                result.add(q[1]);
            }
            else{
                prefix[0]^=q[1];
                prefix[result.size()]^=q[1];
            }
        }
        
        // System.out.println(result);
        // System.out.println(Arrays.toString(prefix));
        
        int pXor = 0;
        for(int i=0;i<result.size();i++){
            pXor^=prefix[i];
            result.set(i,result.get(i)^pXor);
        }
        
        Collections.sort(result);
        
        return result;
    }
}
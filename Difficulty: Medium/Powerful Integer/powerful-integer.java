class Solution {
    public int powerfulInteger(int[][] intervals, int k) {
        // code here
        TreeMap<Integer,int[]> tmap = new TreeMap<>();
        
        for(int[] i: intervals){
            tmap.putIfAbsent(i[0],new int[]{0,0});
            int[] val = tmap.get(i[0]);
            val[0]++;
            tmap.put(i[0],val);
            
            tmap.putIfAbsent(i[1],new int[]{0,0});
            val = tmap.get(i[1]);
            val[1]--;
            tmap.put(i[1],val);
        }
        
        int result = -1;
        int count = 0;
        
        for(var entry: tmap.entrySet()){
            count+=entry.getValue()[0];
            if(count>=k)
                result = entry.getKey();
            
            count+=entry.getValue()[1];
        }
        
        return result;
    }
}
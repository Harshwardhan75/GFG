class Solution {
    public boolean validgroup(int[] arr, int k) {
        // code here
        if(arr.length%k!=0)
            return false;
            
        TreeMap<Integer,Integer> tmap=new TreeMap<>();
        for(int i: arr)
            tmap.put(i,tmap.getOrDefault(i,0)+1);
        
        while(!tmap.isEmpty()){
            int first = tmap.firstKey();
            
            for(int i=0;i<k;i++){
                int curr=first+i;
                
                if(!tmap.containsKey(curr))
                    return false;
                
                tmap.put(curr,tmap.get(curr)-1);
                if(tmap.get(curr)==0)
                    tmap.remove(curr);
            }
        }
        
        return true;
    }
}
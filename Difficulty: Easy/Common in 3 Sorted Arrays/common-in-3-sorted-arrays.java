class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int al = a.length;
        int bl = b.length;
        Set<Integer> set = new HashSet<>();
        for(int i: c)   set.add(i);;
        
        int i,j,k;
        i=j=k=0;
        
        while(i<al && j<bl){
            if(a[i]==b[j] && set.contains(a[i])){
                result.add(a[i]);
                
                int value = a[i];
                
                while(i<al && a[i]==value)  i++;
                while(j<bl && b[j]==value)  j++;
            }
            else
            if(a[i]<b[j])
                i++;
            else
                j++;
        }
        
        return result;
    }
}
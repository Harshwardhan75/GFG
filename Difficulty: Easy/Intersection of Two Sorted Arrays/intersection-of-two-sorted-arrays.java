class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                result.add(a[i]);
                int value = a[i];
                while(i<a.length && a[i]==value)   i++;
                while(j<b.length && b[j]==value)   j++;
            }
            else if(a[i]<b[j])
                i++;
            else
                j++;
        }
        
        return result;
    }
    
}
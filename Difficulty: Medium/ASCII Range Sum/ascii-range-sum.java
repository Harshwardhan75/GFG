class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
        int[] start = new int[26];
        int[] end = new int[26];
        int n=s.length();
        Arrays.fill(start,n);
        Arrays.fill(end,-1);
        int[] prefix = new int[n];
        int p = 0;
        
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            start[c-'a']=Math.min(start[c-'a'],i);    
            end[c-'a']=Math.max(end[c-'a'],i);    
            p+=c;
            prefix[i]=p;
        }
        
        // System.out.println(Arrays.toString(start));
        // System.out.println(Arrays.toString(end));
        
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<26;i++){
            if(start[i]<1end[i]){
                int count = prefix[end[i]-1]-prefix[start[i]];
                if(count>0)
                    result.add(count);
            }
        }
        
        return result;
    }
}
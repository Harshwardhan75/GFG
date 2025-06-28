class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        int max=Math.max(
            Arrays.stream(a).max().orElseThrow(),
            Arrays.stream(b).max().orElseThrow()
        );
        int[] freq=new int[max+1];
        
        for(int i: b)   freq[i]++;
        
        int prefix = 0;
        
        for(int i=0;i<=max;i++){
            prefix+=freq[i];
            freq[i]=prefix;
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        for(int i: a){
            result.add(freq[i]);
        }
        
        return result;
    }
}
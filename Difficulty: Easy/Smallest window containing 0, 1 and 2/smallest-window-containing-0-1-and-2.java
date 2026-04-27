class Solution {
    public int smallestSubstring(String s) {
        // code here
        int[] arr = new int[3];
        arr[0]=arr[1]=arr[2]=-1;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'0']=i;
            
            if(!Arrays.stream(arr).anyMatch(x->x==-1)){
                min = Math.min(min,i - Arrays.stream(arr).min().orElse(0)+1);
            }    
        }
        
        return min==Integer.MAX_VALUE?-1:min;
    }
};

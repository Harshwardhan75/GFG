class Solution {
    public int minCost(String s, String t, char[][] transform, int[] cost) {
        // code here
        long[][] arr = new long[26][26];
        for(long[] i: arr)  Arrays.fill(i,Integer.MAX_VALUE);
        
        for(int i=0;i<26;i++)   arr[i][i] = 0;
        
        for(int i=0;i<transform.length;i++){
            char[] c = transform[i];
            
            if(c[0]==c[1])  continue;
            
            arr[c[0]-'a'][c[1]-'a'] = Math.min(arr[c[0]-'a'][c[1]-'a'],cost[i]);
        }
        
        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
                }
            }
        }
        
        long sum = 0;
        
        for(int i=0;i<s.length();i++){
            int c1 = s.charAt(i)-'a';
            int c2 = t.charAt(i)-'a';
            long min = Integer.MAX_VALUE;
            for(int j=0;j<26;j++){
                if(arr[c1][j] < Integer.MAX_VALUE && arr[c2][j]<Integer.MAX_VALUE)
                    min = Math.min(min,arr[c1][j]+arr[c2][j]);
            }
            
            if(min<Integer.MAX_VALUE)
                sum += min;
            else
                return -1;
        }
        
        return (int)sum;
    }
}
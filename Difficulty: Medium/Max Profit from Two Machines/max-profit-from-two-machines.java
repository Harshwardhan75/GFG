class Solution {
    public int maxProfit(int x, int y, int[] a, int[] b) {
        // code here
        int[][] arr = new int[a.length][];
        for(int i=0;i<arr.length;i++)
            arr[i] = new int[]{Math.abs(a[i]-b[i]),i};
        
        Arrays.sort(arr,(aa,bb)->bb[0]-aa[0]);
        
        int sum = 0;
        
        for(int[] xx: arr){
            int index = xx[1];
            
            if(a[index]>=b[index]){
                if(x>0){
                    x--;
                    sum += a[index];
                }
                else{
                    y--;
                    sum += b[index];
                }
            }
            else{
                if(y>0){
                    y--;
                    sum += b[index];
                }
                else{
                    x--;
                    sum += a[index];
                }
            }
        }
        
        return sum;
    }
}
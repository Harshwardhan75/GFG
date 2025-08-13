class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        int[] freq = new int[k];
        for(int i: arr) freq[i%k]++;
        
        // System.out.println(Arrays.toString(freq));
        int current = freq[0];
        int n = arr.length;
        int needed = (n+1)/2;
        int sum = 0;
        
        for(int i=k-1;i>0;i--){
            int val = current+freq[i];
            if(val<=needed){
                sum = sum + (freq[i]*(k-i));
                current+=freq[i];
            }
            else{
                int req = Math.max(0,needed - current);
                sum = sum + (req*(k-i));
                current += req;
                return sum;
            }
        }
        
        return sum;
    }
}
class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        Arrays.sort(prices);
        int min = 0,max = 0;
        int n = prices.length;
        int i = 0, j = n-1;
        
        while(i<=j){
            min+=prices[i];
            j-=k;
            i++;
        }
        
        i = 0; j = n-1;
        
        while(i<=j){
            max+=prices[j];
            j--;
            i+=k;
        }
        
        return new ArrayList<>(Arrays.asList(min,max));
    }
}

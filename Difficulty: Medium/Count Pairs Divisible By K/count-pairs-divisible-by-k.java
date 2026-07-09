class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        int[] freq = new int[k];
        for(int i: arr) freq[i%k]++;
        // System.out.println(Arrays.toString(freq));
        int count = 0;
        for(int i=1;i<k;i++){
            if(i<k-i)
                count += freq[i]*freq[k-i];
        }
        
        // System.out.println(count);
        
        count += (freq[0]-1)*freq[0]/2;
        if(k%2==0)
            count += (freq[k/2]-1)*freq[k/2]/2;
        return count;
    }
}
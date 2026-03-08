class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int[] freq = new int[1001];
        for(int i: arr)
            freq[i] = 1;
        
        for(int i=1;i<freq.length;i++){
            if(freq[i]==0)  continue;
        
            for(int j=i+1;j<freq.length;j++){
                if(freq[j]==0)  continue;
                
                int square = (i*i)+(j*j);
                
                double value = Math.sqrt((double)square);
                
                if(value%1.00==0.00){
                    int val = (int)value;
                    
                    if(freq[val]>0)
                        return true;
                }
            }
        }
        return false;
    }
}
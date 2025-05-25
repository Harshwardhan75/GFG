class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        boolean[] freq=new boolean[1001];
        
        for(int i: arr)
            freq[i]=true;
        
        for(int i=1;i<freq.length;i++){
            if(!freq[i]) continue;
            for(int j=i+1;j<freq.length;j++){
                if(!freq[j]) continue;
                int square=i*i+j*j;
                
                double x = Math.sqrt((double)square);
                if(x%1.0==0.00){
                    int value = (int)x;
                    
                    if(value<=1000 && freq[value])
                        return true;
                }
            }
        }
        
        return false;
    }
}
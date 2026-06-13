class Solution {
    int MOD = 1_000_000_000+7;
    Map<Long,Long> map = new HashMap<>();
    public int computeValue(int n) {
        // code here
        map.put(0l,1l);
        long val = 1l;
        for(long i=1;i<=n;i++){
            val = (val*i)%MOD;
            map.put(i,val);
        }
        
        long result = 0;
        
        for(int i=0;i<=n;i++){
            result = (result + (NCR(n,i)*NCR(n,i))%MOD)%MOD;
        }
        
        return (int)result;
    }
    
    long NCR(long num,long den){
        return (fact(num)*modInverse(fact(den)*(fact(num-den))%MOD))%MOD;
    }
    
    long fact(long value){
        return map.get(value);
    }
    
    long modInverse(long value){
        return power(value,MOD-2);
    }
    
    long power(long base,long power){
        long result = 1;
        
        while(power>0){
            if(power%2==1){
                result = (result*base)%MOD;
            }
            
            base = (base*base)%MOD;
            power >>= 1;
        }
        
        return result;
    }
}

/*
    n = 3 
    000000 -> 1   
    100000 -> 3
    010000 -> 3   6/2
    001000 -> 3
    
    110000 -> 3   6/2
    101000 -> 3
    011000 -> 3
    
    111000 -> 1   6/6
*/
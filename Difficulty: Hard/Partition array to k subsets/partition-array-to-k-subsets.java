/*You are required to complete this method */
class Solution {
    public boolean isKPartitionPossible(int[] arr, int k) {
        // Your code here
        int[] sum=new int[k];
        return solve(arr,sum,0,new HashMap<>());
    }
    
    boolean solve(int[] arr,int[] sum,int index,Map<String,Boolean> dp){
        if(index>=arr.length){
            int value = sum[0];
            for(int i: sum)
                if(i!=value)
                    return false;
                
            return true;
        }
        int[] copy = Arrays.copyOf(sum, sum.length);
Arrays.sort(copy);
String key = Arrays.toString(copy) + " " + index;
        
        // String key=Arrays.toString(sum)+" "+Integer.toString(index);
        if(dp.containsKey(key))
            return dp.get(key);
        
        for(int i=0;i<sum.length;i++){
            sum[i]+=arr[index];
            if(solve(arr,sum,index+1,dp)){
                dp.put(key,true);
                return true;
            }
            sum[i]-=arr[index];
        }
        dp.put(key,false);
        return false;
    }
}
class Solution {
    int size;
    
    public int vowelCount(String s) {
        // code here
        Map<Character,Integer> map=new HashMap<>();
        String vowels = "aeiou";
        for(char c: s.toCharArray()){
            if(vowels.contains(c+"")){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        
        int[] value = new int[5];
        int index = 0;
        for(char c: map.keySet()){
            value[index++]=map.get(c);
        }
        this.size=map.size();
        if(map.size()==0)
            return 0;
        return solve(value,0,0);
    }
    
    int solve(int[] value,int visited,int took){
        if(took==size){
            return 1;
        }
        int count = 0;
        for(int i=0;i<5;i++){
            if((visited&(1<<i))==0 && value[i]!=0){
                count = (count + (value[i]*solve(value,visited|1<<i,took+1)));
            }
        }
        
        return count;
    }
}
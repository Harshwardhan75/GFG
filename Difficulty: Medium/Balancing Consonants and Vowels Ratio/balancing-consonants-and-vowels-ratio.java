class Solution {
    public int countBalanced(String[] arr) {
        // code here
        ArrayList<int[]> freq = new ArrayList<>();
        
        for(String s: arr){
            int vowel = 0;
            int consonant = 0;
            
            for(char c: s.toCharArray()){
                if(isVowel(c))
                    vowel++;
                else
                    consonant++;
            }
            
            freq.add(new int[]{vowel,consonant});
        }
        
        // for(int[] i: freq){
        //     System.out.println(Arrays.toString(i));
        // }
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix = 0;
        int count = 0;
        
        for(int[] i: freq){
            prefix+=i[0];
            prefix-=i[1];
            
            count+=map.getOrDefault(prefix,0);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        
        return count;
    }
    
    boolean isVowel(char c){
        String vowel = "aeiou";
        return vowel.contains(c+"");
    }
}
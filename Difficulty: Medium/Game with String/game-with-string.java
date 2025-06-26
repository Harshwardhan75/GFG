class Solution {
    public int minValue(String s, int k) {
        // code here
        int[] freq=new int[26];
        for(char c: s.toCharArray())
            freq[c-'a']++;
            
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->freq[b-'a']-freq[a-'a']);
        
        for(char c='a';c<='z';c++){
            if(freq[c-'a']>0)
                pq.offer(c);
        }
        
        while(k>0){
            char c=pq.poll();
            freq[c-'a']--;
            if(freq[c-'a']>0)
                pq.offer(c);
            k--;
        }
        
        int value = 0;
        
        for(int i=0;i<freq.length;i++){
            value = value + freq[i]*freq[i];
        }
        
        return value;
    }
}
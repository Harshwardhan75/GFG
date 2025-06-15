class Solution {
    public int wordLadderLength(String startWord, String targetWord,
                                String[] wordList) {
        // Code here
        Set<String> set=new HashSet<>();
        for(String s: wordList)
            set.add(s);
        
        Queue<String> que=new LinkedList<>();
        if(set.contains(startWord))
            set.remove(startWord);
            
        que.offer(startWord);
        int level = 0;
        
        while(!que.isEmpty()){
            int size=que.size();
            level++;
            
            for(int i=1;i<=size;i++){
                String s=que.poll();
                
                if(s.equals(targetWord))
                    return level;
                
                for(int j=0;j<s.length();j++){
                    char[] c=s.toCharArray();
                    
                    for(char a='a';a<='z';a++){
                        c[j]=a;
                        
                        String newString = new String(c);
                        if(set.contains(newString)){
                            set.remove(newString);
                            que.offer(newString);
                        }
                    }
                }
            }
        }
        
        return 0;
    }
}
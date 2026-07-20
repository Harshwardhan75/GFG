class Trie{
    class Node{
        Node[] links;
        int count;
        
        public Node(){
            this.links = new Node[26];
            this.count = 0;
        }
        
        public Node get(char c){
            return links[c-'a'];
        }
        
        public boolean contains(char c){
            return links[c-'a']!=null;
        }
        
        public void put(char c){
            links[c-'a'] = new Node();
        }
        
        public void incrementCount(){
            count ++;
        }
        
        public int getCount(){
            return count;
        }
    }
    
    Node root = new Node();
    
    public void insert(String s){
        Node temp = root;
        
        for(char c: s.toCharArray()){
            if(!temp.contains(c))
                temp.put(c);
            
            temp = temp.get(c);
            temp.incrementCount();
        }
    }
    
    public String getUniquePrefix(String s){
        Node temp = root;
        StringBuilder sb = new StringBuilder();
        
        for(char c: s.toCharArray()){
            sb.append(c);
            temp = temp.get(c);
            
            if(temp.getCount()<=1)
                break;
        }
        
        return sb.toString();
    }
}

class Solution {
    public ArrayList<String> findPrefixes(String[] arr) {
        // code here
        Trie trie = new Trie();
        
        for(String s: arr)  trie.insert(s);
        
        ArrayList<String> result = new ArrayList<>();
        for(String s: arr)  result.add(trie.getUniquePrefix(s));
        
        return result;
        
    }
}
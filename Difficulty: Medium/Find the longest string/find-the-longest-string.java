class Solution {
    class Trie{
        class Node{
            Node[] links;
            boolean end = false;
            
            Node(){
                links=new Node[26];
            }
            
            void put(char c,Node node){
                links[c-'a']=node;
            }
            
            Node get(char c){
                return links[c-'a'];
            }
            
            boolean contains(char c){
                return links[c-'a']!=null;
            }
            
            void setEnd(){
                this.end=true;
            }
            
            boolean isEnd(){
                return this.end;
            }
        }
        
        Node root=new Node();
        void insert(String s){
            Node temp = root;
            
            for(char c: s.toCharArray()){
                if(!temp.contains(c))
                    temp.put(c,new Node());
                
                temp=temp.get(c);
            }
            
            temp.setEnd();
        }
        
        boolean containsAllPrefix(String s){
            Node temp=root;
            boolean flag = true;
            
            for(char c: s.toCharArray()){
                if(!temp.contains(c))
                    return false;
                    
                temp=temp.get(c);
                flag&=temp.isEnd();
            }
            
            return flag;
        }
    }
    public String longestString(String[] arr) {
        // code here
        Trie trie=new Trie();
        for(String s: arr)  trie.insert(s);
        
        String result = "";
        
        for(String s: arr){
            if(trie.containsAllPrefix(s)){
                if(s.length()>result.length())
                    result = s;
                else if(s.length()==result.length() && s.compareTo(result)<0)
                    result = s;
            }    
        }
        
        return result;
    }
}

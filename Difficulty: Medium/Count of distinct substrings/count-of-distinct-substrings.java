
    class Node{
        Node[] links = new Node[26];
        
        public void put(char c){
            links[c-'a'] = new Node();
        }
        
        public Node get(char c){
            return links[c-'a'];
        }
        
        boolean contains(char c){
            return links[c-'a']!=null;
        }
    }


class Solution {
    public static int countSubs(String s) {
        // code here
        Node root = new Node();
        int count = 0;
        
        for(int i=0;i<s.length();i++){
            Node temp = root;
            
            for(int j=i;j<s.length();j++){
                if(!temp.contains(s.charAt(j)))    {
                    count ++;
                    temp.put(s.charAt(j));
                }
                temp = temp.get(s.charAt(j));
            }
        }
        
        return count;
    }
}
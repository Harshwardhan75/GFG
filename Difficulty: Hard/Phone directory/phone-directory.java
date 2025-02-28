//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String contact[] = in.readLine().trim().split("\\s+");
            String s = in.readLine();
            
            Solution ob = new Solution();
            ArrayList<ArrayList<String>> ans = ob.displayContacts(n, contact, s);
            for(int i = 0;i < ans.size();i++){
                for(int j = 0;j < ans.get(i).size();j++)
                    System.out.print(ans.get(i).get(j) + " ");
                System.out.println();
            }
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
    class Trie {
        class Node {
            Node[] links = new Node[26];
            boolean flag = false;

            boolean containsKey(char c) {
                return links[c - 'a'] != null;
            }

            void put(char c, Node node) {
                links[c - 'a'] = node;
            }

            Node get(char c) {
                return links[c - 'a'];
            }

            void setEnd() {
                flag = true;
            }

            boolean isEnd() {
                return flag;
            }
        }

        Node root;

        Trie() {
            this.root = new Node();
        }

        void insert(String word) {
            Node temp = root;

            for (char c : word.toCharArray()) {
                if (!temp.containsKey(c))
                    temp.put(c, new Node());
                temp = temp.get(c);
            }
            temp.setEnd();
        }
        
        ArrayList<String> startsWith(String s){
            ArrayList<String> arr=new ArrayList<>();
            Node temp=root;
            String str="";
            
            for(char c: s.toCharArray()){
                if(!temp.containsKey(c))
                {
                    arr.add("0");
                    return arr;
                }
                str+=c;
                temp=temp.get(c);
            }
            generateAll(temp,arr,str);
            return arr;
        }
        
        void generateAll(Node temp,ArrayList<String> arr,String s){
            
            for(char c='a';c<='z';c++){
                if(temp.containsKey(c))   {
                    generateAll(temp.get(c),arr,s+c);
                }
            }
            
            if(temp.isEnd())
                arr.add(s);
        }

    }

class Solution{
    
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here
        Trie trie=new Trie();
        
        for(String str: contact)    trie.insert(str);
        ArrayList<ArrayList<String>> result=new ArrayList<>();
        
        for(int i=1;i<=s.length();i++){
            ArrayList<String> arr=trie.startsWith(s.substring(0,i));
            Collections.sort(arr);
            result.add(arr);
        }
        
        return result;
    }
}
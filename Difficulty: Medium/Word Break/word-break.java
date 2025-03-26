//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String line = sc.nextLine();
            String[] dictionary = line.split(" ");

            Solution obj = new Solution();
            if (obj.wordBreak(s, dictionary)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
        class Node{
            Node[] links=new Node[26];
            boolean end=false;
            
            Node get(char c){
                return links[c-'a'];
            }
            
            boolean contains(char c){
                return links[c-'a']!=null;
            }
            
            void put(char c,Node node){
                links[c-'a']=node;
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
            Node temp=root;
            
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(!temp.contains(c))
                    temp.put(c,new Node());
                
                temp=temp.get(c);
            }
            
            temp.setEnd();
        }
    
    
    public boolean wordBreak(String s, String[] dictionary) {
        // code here
        for(String st: dictionary){
            insert(st);
        }
        int n=s.length();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(s.toCharArray(),0,dp)==1;
    }
    
    int solve(char[] s,int index,int[] dp){
        if(index==s.length)
            return 1;
        
        if(dp[index]!=-1)
            return dp[index];
    
        int take = 0;
        Node temp=root;
        for(int i=index;i<s.length;i++){
            
            if(temp.contains(s[i])){
                temp=temp.get(s[i]);
                if(temp.isEnd())
                    take = take | solve(s,i+1,dp);
                    
                if(take == 1)
                    break;
                    
            }
            else
                return dp[index]=0;
        }
        
        return dp[index]=take;
    }
}
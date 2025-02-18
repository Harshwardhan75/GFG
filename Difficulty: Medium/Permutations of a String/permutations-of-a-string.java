//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<String> ans = obj.findPermutation(S);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends




class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        char[] c=s.toCharArray();
        boolean[] visited=new boolean[c.length];
        Set<String> set=new HashSet<>();
        char[] temp=new char[c.length];
        
        f(c,visited,new StringBuilder(),set);
        
        return new ArrayList<>(set);
    }
    
    public void f(char[] c,boolean[] visited,StringBuilder s,Set<String> set){
        if(s.length()==c.length){
            set.add(s.toString());
            return ;
        }
        
        for(int i=0;i<c.length;i++){
            if(!visited[i]){
                visited[i]=true;
                s.append(c[i]);
                f(c,visited,s,set);
                s.deleteCharAt(s.length()-1);
                visited[i]=false;;
            }
        }
    }
}
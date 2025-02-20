//{ Driver Code Starts
import java.util.*;

class suffix
{
     int index;  
    int rank[] = new int[2];
}

class UniqueSubStr
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            GfG g = new GfG();
            System.out.println(g.countDistinctSubstring(st));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*You are required to complete this method */
class GfG
{
    
    static class Node{
        Node[] links=new Node[26];
        
        boolean containsKey(char c){
            return links[c-'a']!=null;
        }
        
        void put(char c,Node node){
            links[c-'a']=node;
        }
        
        Node get(char c){
            return links[c-'a'];
        }
    }
    
    public static int countDistinctSubstring(String st)
    {
        //your code here
        
        int count=0;
        Node root=new Node();
        int n=st.length();
        
        for(int i=0;i<n;i++){
            Node node=root;
            
            for(int j=i;j<n;j++){
                if(!node.containsKey(st.charAt(j))){
                    node.put(st.charAt(j),new Node());
                    count++;
                }
                node=node.get(st.charAt(j));
            }
        }
        
        return count+1;
    }
}
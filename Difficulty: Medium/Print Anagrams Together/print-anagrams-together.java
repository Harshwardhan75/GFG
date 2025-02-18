//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] s) {
        // code here
        boolean[] taken=new boolean[s.length];
        ArrayList<ArrayList<String>> result=new ArrayList<>();
        
        for(int i=0;i<s.length;i++){
            if(taken[i])    continue;
            ArrayList<String> arr=new ArrayList<>();
            arr.add(s[i]);
            int[] freq=new int[26];
            for(int x=0;x<s[i].length();x++)    freq[s[i].charAt(x)-'a']++;
            
            for(int j=i+1;j<s.length;j++){
                if(taken[j])    continue;
                if(possible(freq,s[j])){
                    taken[j]=true;
                    arr.add(s[j]);
                }
            }
            result.add(arr);
        }
        
        return result;
    }
    
    boolean possible(int[] com,String s){
        
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)-'a']++;
        
        for(int i=0;i<freq.length;i++)
            if(freq[i]!=com[i])
                return false;
        
        return true;
    }
}



//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline after the test case input
        while (t-- > 0) {
            String inputLine = sc.nextLine();
            String[] arr = inputLine.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.anagrams(arr);
            result.sort(Comparator.comparing(a -> a.get(0)));
            for (ArrayList<String> group : result) {
                for (String word : group) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends
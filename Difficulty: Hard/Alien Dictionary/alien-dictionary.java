//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public String findOrder(String[] words) {
        // code here
        Map<Character,ArrayList<Character>> map=new HashMap<>();
        int n=words.length;
        Set<Character> set=new HashSet<>();
        for(String word : words) {
            for(char c : word.toCharArray()) {
                set.add(c);
            }
        }
        for(int i=0;i<n-1;i++){
            char[] c=find(words[i],words[i+1]);
            if (c.length == 0) {
                if (words[i].length() > words[i + 1].length()) {
                    return ""; 
                }
                continue;
            }
            ArrayList<Character> arr=map.getOrDefault(c[0],new ArrayList<>());
            arr.add(c[1]);
            map.put(c[0],arr);
        }

        // System.out.println(map);
        // return "";
        int[] freq=new int[26];
        Queue<Character> que=new LinkedList<>();
        for(char c: map.keySet()){
            for(char x: map.get(c)){
                freq[x-'a']++;
            }
        }
        
        for(char c: set){
            if(freq[c-'a']==0)
                que.offer(c);
        }
        
        StringBuilder result=new StringBuilder();
        
        while(!que.isEmpty()){
            char c=que.poll();
            result.append(c);
            if(map.containsKey(c))
                for(char x: map.get(c)){
                    freq[x-'a']--;
                    if(freq[x-'a']==0)
                        que.offer(x);
                }
        }
        
        // System.out.println(result); 
        
        return result.length()==set.size() ? result.toString():"";
    }
    
    char[] find(String a,String b){
        int n=Math.min(a.length(),b.length());
        
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i))
                return new char[]{a.charAt(i),b.charAt(i)};
        }
        
        return new char[]{};
    }
}


//{ Driver Code Starts.

public class GFG {
    private static boolean validate(String[] original, String order) {
        Map<Character, Integer> mp = new HashMap<>();
        for (String word : original) {
            for (char ch : word.toCharArray()) {
                mp.put(ch, 1);
            }
        }
        for (char ch : order.toCharArray()) {
            if (!mp.containsKey(ch)) {
                return false;
            }
            mp.remove(ch);
        }
        if (!mp.isEmpty()) {
            return false;
        }

        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            indexMap.put(order.charAt(i), i);
        }

        for (int i = 0; i < original.length - 1; i++) {
            String a = original[i];
            String b = original[i + 1];
            int k = 0, n = a.length(), m = b.length();

            while (k < n && k < m && a.charAt(k) == b.charAt(k)) {
                k++;
            }

            if (k < n && k < m &&
                indexMap.get(a.charAt(k)) > indexMap.get(b.charAt(k))) {
                return false;
            }
            if (k != n && k == m) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // Number of test cases

        while (t-- > 0) {
            String[] words = sc.nextLine().split(" ");
            String[] original = Arrays.copyOf(words, words.length);

            Solution ob = new Solution();
            String order = ob.findOrder(words);

            if (order.isEmpty()) {
                System.out.println("\"\"");
            } else {
                System.out.println(validate(original, order) ? "true" : "false");
            }
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends
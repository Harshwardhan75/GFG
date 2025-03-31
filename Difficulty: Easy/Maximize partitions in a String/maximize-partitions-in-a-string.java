//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.maxPartitions(s);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxPartitions(String s) {
        // code here
        int[] start=new int[26];
        int[] end=new int[26];
        Arrays.fill(start,-1);
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(start[c-'a']==-1)
                start[c-'a']=i;
            
            end[c-'a']=i;
        }
        
        
        ArrayList<int[]> arr=new ArrayList<>();
        
        for(int i=0;i<26;i++){
            if(start[i]!=-1)
                arr.add(new int[]{start[i],end[i]});
        }
        
        Collections.sort(arr,(a,b)->{
            int v=a[0]-b[0];
            if(v==0)
                v=a[1]-b[1];
            return v;
        });
        
        int count = 0;
        int lastend=-1;
        
        for(int[] i: arr){
            if(lastend<i[0])
                count++;
            
            lastend=Math.max(lastend,i[1]);
        }

        return count;
    }
}
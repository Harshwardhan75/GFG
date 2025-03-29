//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=deadline.length;
        int[] time = new int[Arrays.stream(deadline).max().orElseThrow()+1];
        
        int[][] arr=new int[n][];
        for(int i=0;i<n;i++){
            arr[i]=new int[]{deadline[i],profit[i]};
        }
        Arrays.sort(arr,(a,b)->b[1]-a[1]);
        
        int count=0;
        int pro=0;
        for(int[] i: arr){
            for(int j=i[0];j>=1;j--){
                if(time[j]==0){
                    pro+=i[1];
                    count++;
                    time[j]=1;
                    break;
                }
            }
        }
        
        return new ArrayList<>(Arrays.asList(count,pro));
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());

        while (t-- > 0) {
            String[] deadlineInput = sc.nextLine().trim().split("\\s+");
            int[] deadline =
                Arrays.stream(deadlineInput).mapToInt(Integer::parseInt).toArray();

            String[] profitInput = sc.nextLine().trim().split("\\s+");
            int[] profit =
                Arrays.stream(profitInput).mapToInt(Integer::parseInt).toArray();
            Solution obj = new Solution();
            ArrayList<Integer> result = obj.jobSequencing(deadline, profit);
            System.out.println(result.get(0) + " " + result.get(1));
            System.out.println("~");
        }

        sc.close();
    }
}
// } Driver Code Ends
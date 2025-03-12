//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            int capacity = Integer.parseInt(br.readLine());
            String[] valInput = br.readLine().split(" ");
            String[] wtInput = br.readLine().split(" ");

            int[] val = new int[valInput.length];
            int[] wt = new int[wtInput.length];

            for (int i = 0; i < valInput.length; i++) {
                val[i] = Integer.parseInt(valInput[i]);
            }

            for (int i = 0; i < wtInput.length; i++) {
                wt[i] = Integer.parseInt(wtInput[i]);
            }

            System.out.println(Solution.knapsack(capacity, val, wt));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to return max value that can be put in knapsack of capacity.
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=wt.length;
        int[] dp=new int[W+1];
        for(int i=wt[0];i<=W;i++)   dp[i]=val[0];
        
        for(int i=1;i<n;i++){
            for(int w=W;w>=0;w--){
                int notpick = dp[w];
                int pick = 0;
                
                if(wt[i]<=w)
                    pick = val[i]+dp[w-wt[i]];
                
                dp[w]=Math.max(pick,notpick);
            }
        }
        return dp[W];
    }
}

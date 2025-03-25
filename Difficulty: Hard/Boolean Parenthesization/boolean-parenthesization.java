//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.countWays(s));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int countWays(String s) {
        // code here
        int n = s.length();

        // Create DP tables to store the number of ways to evaluate to true and false
        int[][] trueWays = new int[n][n];
        int[][] falseWays = new int[n][n];

        // Initialize the DP tables for single characters
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'T') {
                trueWays[i][i] = 1;
                falseWays[i][i] = 0;
            } else if (s.charAt(i) == 'F') {
                trueWays[i][i] = 0;
                falseWays[i][i] = 1;
            }
        }

        // Fill the DP tables for substrings of length > 1
        for (int length = 3; length <= n; length += 2) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;

                for (int k = i + 1; k < j; k += 2) {
                    char operator = s.charAt(k);

                    int leftTrue = trueWays[i][k - 1];
                    int leftFalse = falseWays[i][k - 1];
                    int rightTrue = trueWays[k + 1][j];
                    int rightFalse = falseWays[k + 1][j];

                    // Combine results based on the operator
                    if (operator == '&') {
                        trueWays[i][j] += leftTrue * rightTrue;
                        falseWays[i][j] += leftTrue * rightFalse + leftFalse * rightTrue + leftFalse * rightFalse;
                    } else if (operator == '|') {
                        trueWays[i][j] += leftTrue * rightTrue + leftTrue * rightFalse + leftFalse * rightTrue;
                        falseWays[i][j] += leftFalse * rightFalse;
                    } else if (operator == '^') {
                        trueWays[i][j] += leftTrue * rightFalse + leftFalse * rightTrue;
                        falseWays[i][j] += leftTrue * rightTrue + leftFalse * rightFalse;
                    }
                }
            }
        }

        // Return the number of ways to evaluate the whole expression to true
        return trueWays[0][n - 1];

    }
}
//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            int target = Integer.parseInt(sc.nextLine());

            Solution ob = new Solution();
            int ans = ob.countTriplets(arr, target);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    public int countTriplets(int[] arr, int target) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == target) {
                    // Count all valid combinations
                    if (arr[j] == arr[k]) {
                        int numDuplicates = k - j + 1;
                        count += (numDuplicates * (numDuplicates - 1)) / 2; // Combination formula
                        break;
                    } else {
                        int leftDuplicates = 1, rightDuplicates = 1;

                        // Count duplicates on the left
                        while (j + 1 < k && arr[j] == arr[j + 1]) {
                            j++;
                            leftDuplicates++;
                        }

                        // Count duplicates on the right
                        while (k - 1 > j && arr[k] == arr[k - 1]) {
                            k--;
                            rightDuplicates++;
                        }

                        // Add combinations formed by left and right duplicates
                        count += leftDuplicates * rightDuplicates;

                        // Move pointers after processing duplicates
                        j++;
                        k--;
                    }
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return count;
    }
}

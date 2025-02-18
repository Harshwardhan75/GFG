//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        
        Double distance(){
            return Math.sqrt((x*x)+(y*y));
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        ArrayList<Pair> arr=new ArrayList<>();
        
        for(int[] p: points){
            arr.add(new Pair(p[0],p[1]));
        }
        
        Collections.sort(arr,(a,b)->Double.compare(a.distance(),b.distance()));
        int[][] result=new int[k][];
        for(int i=0;i<k;i++){
            result[i]=new int[]{arr.get(i).x,arr.get(i).y};
        }
        return result;
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] points = new int[n][2];
            for (int i = 0; i < n; i++) {
                points[i][0] = scanner.nextInt();
                points[i][1] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int[][] ans = solution.kClosest(points, k);

            Arrays.sort(ans, (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            });
            for (int[] point : ans) {
                System.out.println(point[0] + " " + point[1]);
            }
            System.out.println("~");
        }

        scanner.close();
    }
}
// } Driver Code Ends
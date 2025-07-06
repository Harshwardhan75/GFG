import java.util.*;

class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        reverse(a);
        reverse(b);

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        Set<String> visited = new HashSet<>();

        int n = a.length;
        int m = b.length;

        // Initial max sum
        maxHeap.add(new int[]{a[0] + b[0], 0, 0});
        visited.add("0#0");

        while (k-- > 0 && !maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            int sum = top[0], i = top[1], j = top[2];
            result.add(sum);

            if (i + 1 < n && !visited.contains((i + 1) + "#" + j)) {
                maxHeap.add(new int[]{a[i + 1] + b[j], i + 1, j});
                visited.add((i + 1) + "#" + j);
            }

            if (j + 1 < m && !visited.contains(i + "#" + (j + 1))) {
                maxHeap.add(new int[]{a[i] + b[j + 1], i, j + 1});
                visited.add(i + "#" + (j + 1));
            }
        }

        return result;
    }

    void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}

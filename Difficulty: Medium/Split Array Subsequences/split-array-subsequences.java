class Solution {

    public boolean isPossible(int[] arr, int k) {
        // Code here
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> endMap = new HashMap<>();
        
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        for (int num : arr) {
            if (count.get(num) == 0) continue;
            
            // Try to append to existing subsequence
            if (endMap.getOrDefault(num - 1, 0) > 0) {
                endMap.put(num - 1, endMap.get(num - 1) - 1);
                endMap.put(num, endMap.getOrDefault(num, 0) + 1);
                count.put(num, count.get(num) - 1);
            } else {
                // Try to start a new subsequence of length k
                boolean canForm = true;
                for (int i = 0; i < k; i++) {
                    if (count.getOrDefault(num + i, 0) <= 0) {
                        canForm = false;
                        break;
                    }
                }
                if (!canForm) return false;
                
                // Reduce counts and mark end
                for (int i = 0; i < k; i++) {
                    count.put(num + i, count.get(num + i) - 1);
                }
                endMap.put(num + k - 1, endMap.getOrDefault(num + k - 1, 0) + 1);
            }
        }
        return true;
    }
}
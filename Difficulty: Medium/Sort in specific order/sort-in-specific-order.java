class Solution {
    public void sortIt(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i: arr)
            result.add(i);
        
        Collections.sort(result,(a,b)->{
            boolean isAodd = a % 2 != 0;
            boolean isBodd = b % 2 != 0;

            if (isAodd && isBodd) {
                // Both odd -> descending order
                return b - a;
            } else if (!isAodd && !isBodd) {
                // Both even -> ascending order
                return a - b;
            } else {
                // Odd comes before even
                return isAodd ? -1 : 1;
            }
        });
        
        for(int i=0;i<arr.length;i++)
            arr[i] = result.get(i);
    }
}

class Solution {
    public int maxArea(List<Integer> height) {
        // code here
        int left = 0, right = height.size()-1;
        int max = 0;
        
        while(left<=right){
            int distance = right - left -1;
            int min = Math.min(height.get(left),height.get(right));
            
            max = Math.max(max,distance*min);
            
            if(height.get(left)<=height.get(right))
                left++;
            else
                right--;
        }
        
        return max;
    }
}
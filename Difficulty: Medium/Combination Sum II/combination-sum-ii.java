// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    static ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // add your code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        solve(result,new ArrayList<>(),arr,0,target);
        return result;
    }
    
    static void solve(ArrayList<ArrayList<Integer>> result,
                ArrayList<Integer> temp,int[] arr,int index,int target){
                    
        if(target==0)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        if(target<0)
            return;
        
        if(index>=arr.length)
            return;
        
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            
            temp.add(arr[i]);
            solve(result,temp,arr,i+1,target-arr[i]);
            temp.remove(temp.size()-1);
        }
    }
}
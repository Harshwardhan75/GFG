// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        // add your code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        solve(result,new ArrayList<>(),arr,target,0);
        
        return result;
    }
    
    static void solve(ArrayList<ArrayList<Integer>> result,
            ArrayList<Integer> arr1,int[] arr,int target,int index){
        if(target<0)
            return;
        
        if(target==0){
            result.add(new ArrayList<>(arr1));
            return;
        }
        
        if(index>=arr.length)
            return ;
        
        solve(result,arr1,arr,target,index+1);
        
        arr1.add(arr[index]);
        
        solve(result,arr1,arr,target-arr[index],index);
        
        arr1.remove(arr1.size()-1);
    }
}
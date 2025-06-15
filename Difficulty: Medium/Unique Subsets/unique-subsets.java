class solve {
    // Function to find all possible unique subsets.
    public static ArrayList<ArrayList<Integer>> AllSubsets(int arr[], int n) {
        // your code here
        Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        solve(result,new ArrayList<>(),arr,0);
        
        return result;
    }
    
    static void solve(ArrayList<ArrayList<Integer>> result,
    ArrayList<Integer> temp,int[] arr,int index){
        result.add(new ArrayList<>(temp));
        
        if(index>=arr.length){
            return;
        }
        
        
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1])
                continue;
            
            temp.add(arr[i]);
            solve(result,temp,arr,i+1);
            temp.remove(temp.size()-1);
        }
    }
}

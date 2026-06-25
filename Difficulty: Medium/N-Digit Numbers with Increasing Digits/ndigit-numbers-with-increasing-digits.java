class Solution {
    public static ArrayList<Integer> increasingNumbers(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        solve(arr,n,-1,"");
        return arr;
    }
    
    static void solve(ArrayList<Integer> arr,int n,int prev,String s){
        if(n==0){
            if(Integer.toString(Integer.parseInt(s)).length()==s.length())
                arr.add(Integer.parseInt(s));
            
            return;
        }
        
        for(int i=prev+1;i<=9;i++){
            solve(arr,n-1,i,s+i);
        }
    }
}

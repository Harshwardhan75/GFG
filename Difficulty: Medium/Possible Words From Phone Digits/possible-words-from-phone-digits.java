class Solution {
    
    String[] map = new String[]{" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        solve(result,0,arr,"");
        return result;
    }
    
    void solve(ArrayList<String> result,int index,int[] arr,String res){
        if(index>=arr.length){
            result.add(res.trim());
            return;
        }
        
        String s = map[arr[index]];
        
        for(char c: s.toCharArray()){
            solve(result,index+1,arr,res.trim()+c);
        }
    }
}
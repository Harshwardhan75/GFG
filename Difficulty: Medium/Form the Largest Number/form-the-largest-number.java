class Solution {
    public String findLargest(int[] arr) {
        // code here
        ArrayList<String> temp = new ArrayList<>();
        for(int i: arr) temp.add(Integer.toString(i));
        
        Collections.sort(temp,(a,b)->{
            return (b+a).compareTo(a+b);
        });
        
        StringBuilder sb = new StringBuilder();
        for(String s: temp)
            sb.append(s);
            
        if(sb.charAt(0)=='0')
            return "0";
        
        return sb.toString();
    }
}
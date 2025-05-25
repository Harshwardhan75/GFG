// User function Template for Java

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here
        if(n==1)
            return new ArrayList<>(Arrays.asList(1));
        
        ArrayList<Integer> prev=factorial(n-1);
        
        ArrayList<Integer> result=multiply(prev,n);
        return result;
    }
    
    static ArrayList<Integer> multiply(ArrayList<Integer> arr,int m){
        int carry = 0;
        int index=arr.size()-1;
        ArrayList<Integer> result=new ArrayList<>();
        
        while(index>=0){
            int sum = carry;
            sum+=arr.get(index)*m;
            index--;
            result.add(sum%10);
            carry=sum/10;
        }
        
        while(carry>0){
            result.add(carry%10);
            carry/=10;
        }
        
        Collections.reverse(result);
        return result;
    }
}
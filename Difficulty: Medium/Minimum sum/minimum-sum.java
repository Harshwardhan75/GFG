class Solution {
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(i%2==0)
                s1.append(arr[i]);
            else
                s2.append(arr[i]);
        }
        
        return add(s1,s2);
    }
    
    String add(StringBuilder s1,StringBuilder s2){
        int n=s1.length();
        int m=s2.length();
        int i=n-1,j=m-1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum+=(s1.charAt(i)-'0');
                i--;
            }
            
            if(j>=0){
                sum+=(s2.charAt(j)-'0');
                j--;
            }
            
            result.append(sum%10);
            carry=sum/10;
        }
        if(carry==1)
            result.append(1);
        
        i=result.length()-1;
        
        while(i>=0 && result.charAt(i)=='0')
            i--;
        // if(i==-1)
        //     return "0";
        result = new StringBuilder(result.substring(0,i+1));
        return result.reverse().toString();
    }
}

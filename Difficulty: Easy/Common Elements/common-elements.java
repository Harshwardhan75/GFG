// User function Template for Java

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        ArrayList<Integer> result=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        
        while(i<n && j<m){
            if(a[i]==b[j]){
                result.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j])
                i++;
            else
                j++;
        }
        
        return result;
    }
}
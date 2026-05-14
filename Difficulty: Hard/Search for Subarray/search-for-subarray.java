class Solution {
    public ArrayList<Integer> search(int[] a, int[] b) {
        // code here
        int[] lps = findLPS(b);
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = a.length;
        int m = b.length;
        
        int first = 0, second = 0;
        
        while(first<n){
            if(a[first]==b[second]){
                first++;
                second++;
            }
            else{
                if(second==0)
                    first++;
                else
                    second = lps[second-1];
            }
            
            if(second==m){
                result.add(first-m);
                second=lps[second-1];
            }
        }
        
        return result;
    }
    
    int[] findLPS(int[] arr){
        int n = arr.length;
        
        int[] result = new int[n];
        int pre = 0, suf = 1;
        
        while(suf<n){
            if(arr[pre]==arr[suf]){
                result[suf] = pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0)
                    suf++;
                else
                    pre = result[pre-1];
            }
        }
        
        return result;
    }
}
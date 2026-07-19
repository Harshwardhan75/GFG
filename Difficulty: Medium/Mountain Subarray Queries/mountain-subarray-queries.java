class Solution {
    public ArrayList<Boolean> processQueries(int[] arr, int[][] queries) {
        // code here
        int n = arr.length;
        int[] templ = new int[n];
        int[] tempr = new int[n];
        
        // for(int i=0;i<n;){
        //     int start = i-1, end = i+1;
        //     templ[i] = 1;
        //     tempr[i] = 1;
            
        //     while(start>=0 && arr[start]<=arr[start+1])
        //     {
        //         templ[start] = templ[start+1]+1;
        //         start--;
        //     }
            
        //     while(end<n && arr[end]<=arr[end-1]){
        //         tempr[end] = tempr[end-1]+1;
        //         end++;
        //     }
            
        //     i = end;
        // }
        
        templ[0] = 1;
        for(int i=1;i<n;i++){
            if(arr[i-1]<=arr[i]){
                templ[i] = templ[i-1]+1;
            }
            else{
                templ[i] = 1;
            }
        }
        
        tempr[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            if(arr[i+1]<=arr[i]){
                tempr[i] = tempr[i+1]+1;
            }
            else{
                tempr[i] = 1;
            }
        }
        // System.out.println(Arrays.toString(templ));
        // System.out.println(Arrays.toString(tempr));
        int[] left = new int[n];
        int[] right = new int[n];
        
        for(int i=n-1;i>=0;){
            int val = templ[i];
            int index = 1;
            
            while(val>0){
                left[i] = index;
                index++;
                val--;
                i--;
            }
            // i--;
        }
        
        for(int i=0;i<n;){
            int val = tempr[i];
            int index = 1;
            while(val>0){
                right[i] = index;
                index++;
                val--;
                i++;
            }
            // i++;
        }
        
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        // return new ArrayList<>();
        
        ArrayList<Boolean> result = new ArrayList<>();
        
        for(int[] q: queries){
            int l = q[0], r = q[1];
            int length = left[l] + right[r] -1;
            
            if(length >= ((r-l+1)))
                result.add(true);
            else
                result.add(false);
        }
        
        return result;
    }
}
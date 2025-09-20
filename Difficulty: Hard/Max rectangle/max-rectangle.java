class Solution {
    static int maxArea(int mat[][]) {
        // code here
        int n = mat.length;
        int m=mat[0].length;
        int max = 0;
        int[] arr = new int[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0)
                    arr[j] = 0;
                else
                    arr[j]++;
            }
            
            max = Math.max(max,maxRectangle(arr));
        }
        
        return max;
    }
    
    static int maxRectangle(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int max= 0;
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                int nse = i;
                int e = arr[st.pop()];
                int pse = st.isEmpty()?-1:st.peek();
                
                max = Math.max(max,(nse-pse-1)*e);
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            int nse = n;
            int e = arr[st.pop()];
            int pse = st.isEmpty()?-1:st.peek();
            
            max = Math.max(max,(nse-pse-1)*e);
        }
        
        return max;
    }
}
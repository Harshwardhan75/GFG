class Solution {
    ArrayList<Integer> result=new ArrayList<>();
    public ArrayList<Integer> leafNodes(int[] preorder) {
        // code here
        preOrder(preorder,new int[]{0},Integer.MAX_VALUE);
        return result;
    }
    
    int preOrder(int[] arr,int[] index,int value){
        if(index[0]>=arr.length || arr[index[0]]>=value)
            return 1;
            
        int i=index[0];
        index[0]++;
        
        int value1 = preOrder(arr,index,arr[i]);
        int value2 = preOrder(arr,index,value);
        
        if(value1==1 && value2==1)
            result.add(arr[i]);
        return 0;
    }
}
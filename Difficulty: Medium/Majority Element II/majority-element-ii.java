class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n=arr.length;
        int e1=-1,e2=-1,count1=0,count2=0;
        
        for(int i=0;i<n;i++){
            if(count1==0 && arr[i]!=e2){
                count1++;
                e1=arr[i];
            }
            else if(count2==0 && arr[i]!=e1){
                count2++;
                e2=arr[i];
            }
            else if(arr[i]==e1)
                count1++;
            else if(arr[i]==e2)
                count2++;
            else{
                count1--;
                count2--;
            }
        }
        
        count1=count2=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==e1){
                count1++;
            }
            else if(arr[i]==e2){
                count2++;
            }
        }
        
        if(count1>n/3 && count2>n/3){
            return new ArrayList<>(Arrays.asList(Math.min(e1,e2),Math.max(e1,e2)));
        }
        
        if(count1>n/3)
            return new ArrayList<>(Arrays.asList(e1));
            
        if(count2>n/3)    
            return new ArrayList<>(Arrays.asList(e2));
        
        return new ArrayList<>();
    }
}
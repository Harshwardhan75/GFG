class Solution {
    public boolean canServe(int[] arr) {
        // code here
        int five = 0, ten = 0, twenty = 0;
        
        for(int i: arr){
            if(i==5){
                five++;
            }
            else if(i == 10){
                if(five==0)
                    return false;
                
                five--;
                ten++;
            }
            else{
                if((five>=1 && ten>=1) || five>=3){
                    if(ten>=1){
                        five--;
                        ten--;
                    }
                    else
                        five-=3;
                    
                    twenty ++;
                }
                else
                    return false;
            }
        }
        
        return true;
    }
}
class Solution {
    
    int hash(char c){
        return c-'a'+1;
    }
    
    ArrayList<Integer> search(String pat, String txt) {
        // Code here
        int patValue=0;
        int txtValue=0;
        for(int i=0;i<pat.length();i++){
            patValue+=hash(pat.charAt(i));
            txtValue+=hash(txt.charAt(i));
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        
        if(patValue==txtValue){
            if(check(pat,txt,0))
                result.add(0+1);
        }
        
        int right = pat.length();
        int left=0;
        
        while(right<txt.length()){
            txtValue+=hash(txt.charAt(right));
            txtValue-=hash(txt.charAt(left));
            
            left++;
            right++;
            
            if(patValue==txtValue){
                if(check(pat,txt,left))
                    result.add(left+1);
            }
        }
        
        return result;
    }
    
    boolean check(String a,String b,int index){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(index+i))
                return false;
        }
        return true;
    }
}
/*complete the Function*/

class Solution {
    public ArrayList<String> generateIp(String s) {
        // code here
        ArrayList<String> result=new ArrayList<>();
        
        solve(s,0,result,"",1);
        
        return result;
    }
    
    void solve(String s,int index,ArrayList<String> result,String res,int band){
        if(index>=s.length())
            return;
            
        if(band==4){
            String temp="";
            for(int i=index;i<s.length();i++){
                temp+=s.charAt(i);
                if(Integer.parseInt(temp)>255 || temp.length()>3 || (temp.length()>1 && temp.charAt(0)=='0'))
                    return;
            }
            
            if(0<=Integer.parseInt(temp) && Integer.parseInt(temp)<=255){
                result.add(new String(res.substring(1)+"."+temp));
            }
            return;
        }
        
        
        String temp="";
        
        for(int i=index;i<s.length();i++){
            temp+=s.charAt(i);
            
            if(Integer.parseInt(temp)>255 || temp.length()>3 || (temp.length()>1 && temp.charAt(0)=='0'))
                return;
                
            if(0<=Integer.parseInt(temp) && Integer.parseInt(temp)<=255){
                solve(s,i+1,result,res+"."+temp,band+1);
            }
        }
    }
}
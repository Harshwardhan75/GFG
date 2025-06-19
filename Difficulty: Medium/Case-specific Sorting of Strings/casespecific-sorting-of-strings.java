class Solution {
    public static String caseSort(String s) {
        // code here
        int[] upper=new int[26];
        int[] lower=new int[26];
        
        ArrayList<Integer> u=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        
        char[] c=s.toCharArray();
        
        for(int i=0;i<c.length;i++){
            if(c[i]>='A' && c[i]<='Z'){
                u.add(i);
                upper[c[i]-'A']++;
            }
            else{
                l.add(i);
                lower[c[i]-'a']++;
            }
        }
        int index=0;
        for(int i=0;i<26;i++){
            while(upper[i]>0){
                int j=u.get(index++);
                c[j]=(char)(i+'A');
                upper[i]--;
            }
        }
        
        index=0;
        for(int i=0;i<26;i++){
            while(lower[i]>0){
                int j=l.get(index++);
                c[j]=(char)(i+'a');
                lower[i]--;
            }
        }
        
        return new String(c);
    }
}
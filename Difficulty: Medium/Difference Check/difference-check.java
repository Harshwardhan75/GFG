class Solution {
    public int minDifference(String[] arr) {
        // code here
        
        // Arrays.sort(arr,(a,b)->{
        //     String[] s1 = a.split(":");
        //     String[] s2 = b.split(":");
        //     if(!s1[0].equals(s2[0]))
        //         return s1[0].compareTo(s2[0]);
                
        //     if(!s1[1].equals(s2[1]))
        //         return s1[1].compareTo(s2[1]);
            
            
        //     return s1[2].compareTo(s2[2]);
        // });
        
        // System.out.println(Arrays.toString(arr));
        
        ArrayList<Integer> seconds = new ArrayList<>();
        for(String s: arr){ 
            String[] str = s.split(":");
            int time = Integer.parseInt(str[0])*60*60+
                        Integer.parseInt(str[1])*60+
                            Integer.parseInt(str[2]);
            
            seconds.add(time);
            // seconds.add(Math.min(time,86400-time));
        }
        
        Collections.sort(seconds);
        int n=seconds.size();
            
        int min = Integer.MAX_VALUE;
        
        for(int i=1;i<n;i++)
            min = Math.min(min,seconds.get(i)-seconds.get(i-1));
            
        min = Math.min(min,(60*60*24)-(seconds.get(n-1)-seconds.get(0)));
        
        return min;
    }
}

// User function Template for Java

class Solution {
    static int pageFaults(int N, int C, int pages[]) {
        // code here
        int[] present = new int[1001];
        Arrays.fill(present,-1);
        int count = 0;
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        int counter = 1;
        
        for(int i=0;i<N;i++){
            int p = pages[i];
            if(present[p]==-1){
                count++;
                if(tmap.size()==C){
                    int key = tmap.firstKey();
                    present[tmap.get(key)] = -1;
                    tmap.remove(key);
                }
                
                tmap.put(counter,p);
                present[p] = counter;
                counter++;
            }
            else{
                int counterrr = present[p];
                tmap.remove(counterrr);
                tmap.put(counter,p);
                present[p]=counter;
                counter++;
            }
        }
        
        return count;
    }
}
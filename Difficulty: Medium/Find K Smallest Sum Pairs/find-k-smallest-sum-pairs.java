class Solution {
    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return (arr1[a[0]] + arr2[a[1]]) - (arr1[b[0]] + arr2[b[1]]);
        });
        
        pq.offer(new int[]{0,0});
        Set<String> set = new HashSet<>();
        set.add("0 0");
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        while(k-->0){
            if(pq.isEmpty())    break;
            
            int[] node = pq.poll();
            result.add(new ArrayList<>(Arrays.asList(arr1[node[0]],arr2[node[1]])));
            
            if(node[0]+1<n && !set.contains((node[0]+1)+" "+node[1])){
                pq.offer(new int[]{node[0]+1,node[1]});
                set.add((node[0]+1)+" "+node[1]);
            }
            
            if(node[1]+1<m && !set.contains(node[0]+" "+(node[1]+1))){
                pq.offer(new int[]{node[0],node[1]+1});
                set.add(node[0]+" "+(node[1]+1));
            }
        }
        
        // System.out.println(result);
        
        return result;
    }
}

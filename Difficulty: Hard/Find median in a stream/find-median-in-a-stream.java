//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            ArrayList<Double> ans = ob.getMedian(nums);
            for (double i : ans) {
                System.out.printf("%.1f ", i);
            }
            System.out.println();
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        PriorityQueue<Integer> pq1=new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer> pq2=new PriorityQueue<>();
        int n=arr.length;
        ArrayList<Double> result=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(!pq1.isEmpty() && pq1.peek()>arr[i]){
                pq1.offer(arr[i]);
            }
            else{
                pq2.offer(arr[i]);
            }
        
            if(Math.abs(pq1.size()-pq2.size())>1){
                int a=pq1.size();
                int b=pq2.size();
                
                if(a>b)
                    pq2.offer(pq1.poll());
                else
                    pq1.offer(pq2.poll());
            }
            
            if(pq1.size()==pq2.size()){
                result.add((pq1.peek()+pq2.peek())/2.0);
            }
            else{
                result.add(
                    pq1.size()>pq2.size()?
                    (double)pq1.peek():(double)pq2.peek());
            }
        }
        
        return result;
    }
}
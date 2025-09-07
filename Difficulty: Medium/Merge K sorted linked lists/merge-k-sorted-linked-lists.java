/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
        return merge(0,arr);
    }
    
    Node merge(int index,Node[] arr){
        if(index==arr.length-1){
            return arr[index];
        }
        
        return merge(arr[index],merge(index+1,arr));
    }
    
    Node merge(Node a,Node b){
        Node head = new Node(-1);
        Node temp = head;
        
        while(a!=null && b!=null){
            if(a.data<=b.data){
                temp.next=a;
                a=a.next;
            }
            else{
                temp.next=b;
                b=b.next;
            }
            
            temp=temp.next;
        }
        
        if(a!=null) temp.next=a;
        if(b!=null) temp.next=b;
        
        return head.next;
    }
}
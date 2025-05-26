/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        if(head.data>=data){
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            Node newNode=new Node(data);
            newNode.next=head;
            temp.next=newNode;
            return newNode;
        }
        
        Node temp=head;
        Node prev=null;
        
        while(temp!=null && temp.data<data){
            prev=temp;
            
            temp=temp.next;
            if(temp==head)
                break;
        }
        
        prev.next=new Node(data);
        prev.next.next=temp;
        
        return head;
    }
}
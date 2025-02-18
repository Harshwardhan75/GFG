//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

public class LRUDesign {

    private static List<String> inputLine(Scanner sc) {
        return Arrays.asList(sc.nextLine().split(" "));
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int capacity = Integer.parseInt(sc.nextLine());
            LRUCache cache = new LRUCache(capacity);

            int queries = Integer.parseInt(sc.nextLine());
            while (queries-- > 0) {
                List<String> vec = inputLine(sc);
                if (vec.get(0).equals("PUT")) {
                    int key = Integer.parseInt(vec.get(1));
                    int value = Integer.parseInt(vec.get(2));
                    cache.put(key, value);
                } else {
                    int key = Integer.parseInt(vec.get(1));
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends




// design the class in the most optimal way

class LRUCache {
    static class Node{
        int data,key;
        Node next,prev;
        Node(int key,int data){
            this.key=key;
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    // Constructor for initializing the cache capacity with the given value.
    static Node head,tail;
    static Map<Integer,Node> map;
    static int size;
    LRUCache(int cap) {
        // code here
        map=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        this.size=cap;
    }

    // Function to return value corresponding to the key.
    public static int get(int key) {
        // your code here
        if(!map.containsKey(key))
            return -1;
        
        Node node=map.get(key);
        delete(node);
        add(node);
        return node.data;
    }

    // Function for storing key-value pair.
    public static void put(int key, int value) {
        // your code here
        
        if(map.containsKey(key)){
            Node n=map.get(key);
            delete(n);
            n.data=value;
            add(n);
            return;
        }
        
        if(map.size()==size){
            Node temp=map.get(tail.prev.key);
            map.remove(temp.key);
            delete(temp);
        }
        Node newNode=new Node(key,value);
        add(newNode);
        map.put(key,newNode);
    }
    
    public static void delete(Node node){
        Node next=node.next;
        Node prev=node.prev;
        next.prev=prev;
        prev.next=next;
    }
    
    public static void add(Node node){
        Node next=head.next;
        head.next=node;
        
        node.prev=head;
        node.next=next;
        
        next.prev=node;
        
    }
}

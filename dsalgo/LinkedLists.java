package dsalgo;

public class LinkedLists {

    public static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("working");
        Node head = new Node(110);
        Node middle = new Node(202);
        Node last = new Node(301);


        Node temp = head;

        head.next = middle;
        middle.next = last;
        // last.next = null;

        while (temp!= null) {
            System.out.println(temp.data);
            temp= temp.next;
            
        }

    }
    
}
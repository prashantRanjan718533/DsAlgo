package dsalgo;

public class LinkedLists {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head; // Declare head variable
    
    public void addFirst(int data){
        Node newNode = new Node(data); // Create newNode inside method
        //check if head is null
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head; // Link new node to current head
        head = newNode; // Update head to new node
    }
    
    public void print(){
        Node current = head; // Use temporary variable to traverse
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // Add newline after printing all elements
    }
    
    public static void main(String[] args) {
        System.out.println("working");
        LinkedLists list = new LinkedLists();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.print(); // Test the print method
    }
}

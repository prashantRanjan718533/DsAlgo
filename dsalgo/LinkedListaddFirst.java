package dsalgo;

public class LinkedListaddFirst {

    private int size;
   LinkedListaddFirst(){
    this.size =0;
   }
     class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
     public void addLast(int data){
        Node lastnode = new Node(data);
        if( head == null){
            head = lastnode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next!= null) {
            currentNode= currentNode.next;
        }
        currentNode.next= lastnode;
    }
        
     public void deleteFirst(){
       
        if (head == null) {
            // head= node;
            System.out.println("the list is empty");
            return;
        }
        head= head.next;
     }
     private void deletelast() {
        if (head == null) {
            // head= node;
            System.out.println("the list is empty");
            return;
        }
       Node secondlatnode = head;
       Node lastnodes= head.next;// head.next == null -> lastbode =null then it will give null
       if(head.next== null){
        head= null;
        return;
       }

       while (lastnodes.next !=null) { 
        lastnodes = lastnodes.next;
        secondlatnode = secondlatnode.next;
        
       }
        secondlatnode.next = null;
     }

    private void print() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data +" -> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }
   

    public static void main(String[] args) {
        System.out.println("working");
        LinkedListaddFirst list = new LinkedListaddFirst();
        list.addFirst(1);
        list.addFirst(2);
        list.print();
        list.addFirst(3);
        list.print();
        // list.addFirst(4);
        list.addLast(102);
        list.print();
        list.deleteFirst();
        list.print();
        list.addFirst(333);
        
        list.addLast(23);

        list.print();
        list.deletelast();
        list.print();
        list.deleteFirst();
        list.print(); // Test the print method
        list.deletelast();
        list.print();

    }

}

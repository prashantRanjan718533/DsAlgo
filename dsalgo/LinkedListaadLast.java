package dsalgo;

public class LinkedListaadLast {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LinkedListaadLast last = new LinkedListaadLast();
        last.addLast(202);
        last.addLast(2202);
        last.addLast(20002);
        last.addLast(11);
        last.addLast(23);
        last.printlst();

    }

    Node head;

    private void printlst() {
        if( head == null){
            System.out.println("list is empty");
        }
                       Node cNode = head;
                       while (cNode!= null) {
                        System.out.println(cNode.data);
                        cNode = cNode.next;
                        
                       }
                       System.out.println("Null");
                    }

    private void addLast(int i) {
        Node latNode = new Node(i);
        if (head == null) {
            head = latNode;
            return;
        }

        Node currentnode = head;
        while (currentnode.next!= null) {
            currentnode = currentnode.next;
        }
        currentnode.next = latNode;
    }
}

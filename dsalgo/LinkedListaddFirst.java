package dsalgo;

public class LinkedListaddFirst {
    

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node head;
        public void addFirst(int data){
            Node newNode = new Node(data);
            if( head == null){
                head = newNode;
                return;
            }
          newNode.next = head;
          head = newNode;

        }
        private void print() {
            // TODO Auto-generated method stub
            Node curNode = head;
            while (curNode!= null) {
                System.out.println(curNode.data);
                curNode = curNode.next;
            }
        }
    
    
    public static void main(String[] args) {
        System.out.println("working");
        LinkedListaddFirst list = new LinkedListaddFirst();
        list.addFirst(10);
                list.addFirst(20);
                list.addFirst(30);
                list.addFirst(130);
                list.print(); // Test the print method
                
                            }

           
}


    


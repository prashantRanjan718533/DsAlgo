package dsalgo.queue;

public class QueueWIthLinkedList {
    Node front = null, rear = null;

    public void enqueue(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        //to check empty // 1, 2,3
        if(front== null && rear ==null){
            front = rear = newNode;
            System.out.println(rear.data);
        }
        else{
            // System.out.println("elment queued rear: " +rear.data);
            rear.next = newNode;
            // System.out.println("elment queued rear: " +rear.data);
            rear= newNode;
            System.out.println("elment queued rear: " +rear.data);
        }
    }
    public void dequees(){
        if(front == null){
            System.out.println("queue is empty");
        }
        else{
            System.out.println("dequue elemet "+ front.data);
            front =front.next;
            if(front == null){
                rear = null;
            }
        }
    }

    public static void main(String[] args) {
        QueueWIthLinkedList list = new QueueWIthLinkedList();

        //   System.out.println("Enqueuing element: "+101);
          list.enqueue(101);
        //   System.out.println("Enqueuing element: "+21);
          list.enqueue(21);
        //   System.out.println("Enqueuing element: "+301);
          list.enqueue(301);

        //   list.dequees();
        //   list.dequees();
       
    }
}

class Node {
    int data;
    Node next;
}

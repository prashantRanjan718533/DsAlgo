package dsalgo.LinkedlistQuestions;


public class ReverseLnkedList {

    class RevNode {

        int data;
        RevNode next;
        
        RevNode() {
        }
        
        RevNode(int data) {
            this.data = data;
        }
        
        RevNode(int data, RevNode next) {
            this.data = data;
            this.next = next;
        }
    }
    public static void  printList(RevNode head){
        if(head == null){
            System.out.print("list is empty");
        }
        System.out.println();
       RevNode curr = head;
            while(curr!=null){
                System.out.print(curr.data+" -> ");
                curr= curr.next;
            }
//            System.out.print("-> null");
                // return curr;

    }

    public static void main(String[] args) {
        ReverseLnkedList reverseLnkedList = new ReverseLnkedList();
       RevNode head = reverseLnkedList.new RevNode(1);
       
       head.next =  reverseLnkedList.new RevNode(2);
       head.next.next =  reverseLnkedList.new RevNode(3);
       
       head.next.next.next = reverseLnkedList.new RevNode(4);
       head.next.next.next.next = reverseLnkedList.new RevNode(5);
       
       System.out.println("originia list");
       ReverseLnkedList.printList(head);

       head = reverselist(head);
       ReverseLnkedList.printList(head);

    }
       
           private static RevNode reverselist(RevNode head) {
        
            RevNode curr = head;
            RevNode prev = null;
            //1 2 3 4
            while ((curr!= null)) {
                RevNode nextnode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextnode;
//                System.out.println(prev.data+" -> ");
            }
            return prev;
            
       }
}

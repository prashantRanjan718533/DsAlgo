package dsalgo.LinkedlistQuestions;

public class ReversNodeLL {

    private  static  class Nodes{

        int data;
        Nodes next;
        Nodes() {
        }

        Nodes(int data) {
            this.data = data;
        }

        Nodes(int data, Nodes next) {
            this.data = data;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ReversNodeLL reverseBetween = new ReversNodeLL();
        ReversNodeLL.Nodes head = new Nodes(11);
        head.next = new Nodes(12);
        head.next.next = new Nodes(3);
        head.next.next.next = new Nodes(43);
        head.next.next.next.next = new Nodes(15);

        printoriginalList(head);
        head = reverseoriginalList(head);
        printoriginalList(head);
    }

    private static Nodes reverseoriginalList(Nodes head) {
        System.out.println();
        Nodes prv = null;
        Nodes current = head;
        while (current!= null){
            Nodes nexnode = current.next;
            current.next= prv;
            prv = current;
            current= nexnode;

        }
        return  prv;
    }

    private static void printoriginalList(Nodes head) {
        Nodes currNodes = head;

        while(currNodes != null){
            System.out.print(currNodes.data+" -> ");
            currNodes= currNodes.next;
        }
        System.out.print("NULL");
    }


}

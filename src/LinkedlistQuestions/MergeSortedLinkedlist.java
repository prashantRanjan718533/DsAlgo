package dsalgo.LinkedlistQuestions;

public class MergeSortedLinkedlist {
    private  static class  LstNode{
    int val;
    LstNode next;
    LstNode(){}
       LstNode (int val){this.val = val;}
       LstNode (int val, LstNode next){
        this.val = val;
        this.next = next;
       }

    }
    private  static class  LstNodes {
        int val;
        LstNodes next;

        LstNodes() {
        }

        LstNodes(int val) {
            this.val = val;
        }

        LstNodes(int val, LstNodes next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LstNode head = new LstNode(1);
        head.next = new LstNode(2);

        head.next.next = new LstNode(4);
        head.next.next.next = new LstNode(5);


        printNodeLL(head);
        System.out.println();
        LstNode heads = new LstNode(3);
        heads.next = new LstNode(4);
        heads.next.next = new LstNode(5);
        heads.next.next.next = new LstNode(6);
        heads.next.next.next.next = new LstNode(7);
        printNodeLL(heads);
      LstNode headss = merge2list(head,heads);
        System.out.println();
      printNodeLL(headss);

    }

    private static LstNode merge2list(LstNode head, LstNode heads) {
        LstNode dummy = new LstNode(0);
        LstNode currnt = dummy;
        while (head != null && heads != null){
            if(head.val <= heads.val){
                currnt.next= head;
                head = head.next;
            }
            else{
                currnt.next = heads;
                heads = heads.next;
            }
            currnt = currnt.next;
        }
        if(head != null){
            currnt.next = head;
        }
        if( heads != null){
             currnt.next = heads;
        }

        return dummy.next;
    }

    private static void printNodeLL(LstNode head) {
        LstNode currntnode = head;
        while( currntnode != null){
            System.out.print(" "+currntnode.val);
            currntnode = currntnode.next;
        }
    }
}


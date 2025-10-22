package dsalgo.LinkedlistQuestions;

public class ReverseBetween {
    private static class RevNodess {

        int data;
        RevNodess next;

        RevNodess() {
        }

        RevNodess(int data) {
            this.data = data;
        }

        RevNodess(int data, RevNodess next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ReverseBetween reverseBetween = new ReverseBetween();
        RevNodess head = new RevNodess(1);
        head.next = new RevNodess(2);
        head.next.next = new RevNodess(3);
        head.next.next.next = new RevNodess(4);
        head.next.next.next.next = new RevNodess(5);
        System.out.println("originia list");
        printlistss(head);
        reverseBetween(head, 2, 4);
        System.out.println();
        printlistss(head);
    }

    private static RevNodess reverseBetween(RevNodess head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        RevNodess dummy = new RevNodess(0, head);
        RevNodess pre = dummy;
// first while-loop :store the index number before position
        int position = 1;
        while (position < left) {
            pre = pre.next;
            position++;
        }
        System.out.println();
        System.out.println(pre.data + " " + pre);

// second while-loop ; revese the left- right +1 times
        RevNodess current = pre.next; // 1,2,3,4,5
        System.out.println(current.data);
        int steps = right - left;
        while (steps > 0) {
            RevNodess nextnode = current.next;
            current.next = nextnode.next;
            nextnode.next = pre.next;
            pre.next = nextnode;
            steps--;
        }


        return dummy.next;
    }

    private static void printlistss(RevNodess head) {
        RevNodess currnode = head;
        if (head == null) {
            System.out.println("list is empty");
        }
        while (currnode != null) {
            System.out.print(currnode.data + " ");
            currnode = currnode.next;
        }


    }
}

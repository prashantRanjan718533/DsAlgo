package dsalgo.LinkedlistQuestions;

public class PalindromeLinkedlist {
    class PalindromeLL {

        int data;
        PalindromeLL next;

        PalindromeLL() {
        }

        PalindromeLL(int data) {
            this.data = data;
        }

        PalindromeLL(int data, PalindromeLL next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void printList(PalindromeLL head) {
        if (head == null) {
            System.out.println("list is empty");
        }
        PalindromeLL curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println("-> null");

    }

    public static void main(String[] args) {
        PalindromeLinkedlist reverseLnkedList = new PalindromeLinkedlist();
        PalindromeLL head = reverseLnkedList.new PalindromeLL(1);
        head.next = reverseLnkedList.new PalindromeLL(2);
        head.next.next = reverseLnkedList.new PalindromeLL(3);
        head.next.next.next = reverseLnkedList.new PalindromeLL(2);
        head.next.next.next.next = reverseLnkedList.new PalindromeLL(1);
        printList(head);// middle of ll
        // 2nd half reverse
        // check 1st half and 2nd half
        System.out.println("---- + ---" + isPlaindromLL(head));
    }

    private static boolean isPlaindromLL(PalindromeLL head) {
        if (head == null || head.next == null)
            return true;

        PalindromeLL middle = findMiddle(head);// fist half end .next == second half start
        PalindromeLL secondhalfstart = reverse(middle.next);
        PalindromeLL firsthalfstart = head;
        while (secondhalfstart != null) {
            if (firsthalfstart.data != secondhalfstart.data) {
                return false;
            }
            firsthalfstart = firsthalfstart.next;
            secondhalfstart = secondhalfstart.next;
        }
        System.out.println("done");

        return true;

    }

    private static PalindromeLL findMiddle(PalindromeLL head) {
        System.out.println("inside findMiddle");
        PalindromeLL low = head;
        PalindromeLL high = head;
        if (head.next == null) {
            return head;
        }
        while (high.next != null && high.next.next != null) {
            // System.out.println("while");
            low = low.next;
            high = high.next.next;
        }
        return low;
    }

    private static PalindromeLL reverse(PalindromeLL node) {
        // 3 4 5
        PalindromeLL curr = node;
        PalindromeLL prev = null;
        while (curr != null) {
            PalindromeLL nextNode = curr.next;
            curr.next = prev;// reverse the link
            prev = curr; // advance the prev
            curr = nextNode; // adavance thr curr
        }
        printList(prev);
        return prev;
    }
}

package dsalgo.LinkedlistQuestions;

public class DeleteNthNode {
    // Definition for a singly-linked list node.
    class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        DeleteNthNode deleteNthNode = new DeleteNthNode();
        ListNode head = deleteNthNode.new ListNode(1);
        head.next = deleteNthNode.new ListNode(2);
        head.next.next = deleteNthNode.new ListNode(3);
        head.next.next.next = deleteNthNode.new ListNode(4);
        head.next.next.next.next = deleteNthNode.new ListNode(5);
        System.out.println("Original List");
        deleteNthNode.printnewNode(head);
        System.out.println();
        // Use the instance to call the non-static method
        deleteNthNode.removeNthFromEnd(head, 2);
        deleteNthNode.printnewNode(head);
    }

    public void printnewNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ->");
            head = head.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        // first pass : calculate teh size of the linked list
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        int indextosearch = size - n;
        ListNode prevNode = head;
        int i = 1;
        System.out.println("---");
        while (i < indextosearch) {// why ; here we find the current node
            // System.out.println(prevNode.val);
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        // System.out.println("--headprevNode- "+prevNode.val);
        // System.out.println("--head-");
        return head;
    }

}

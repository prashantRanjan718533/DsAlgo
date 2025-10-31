package dsalgo.LinkedlistQuestions;

public class RevrseNodesKgroup {
    private  static  class Nodesss{

        int data;
        Nodesss next;

        Nodesss(int data) {
            this.data = data;
        }

        Nodesss(int data, Nodesss next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Nodesss head = new RevrseNodesKgroup.Nodesss(11);
        head.next = new RevrseNodesKgroup.Nodesss(22);
        head.next.next = new RevrseNodesKgroup.Nodesss(3);
        head.next.next.next = new RevrseNodesKgroup.Nodesss(422);
        head.next.next.next.next = new RevrseNodesKgroup.Nodesss(15);
        System.out.println("originia list");
        printlistsss(head);
        int k =2;
        head = revrseinKgroup(head, k);
        System.out.println();
        printlistsss(head);
    }

    private static Nodesss revrseinKgroup(Nodesss head, int k) {
        if(head == null || k==1){
            return head;
        }
        Nodesss temp = head;
        Nodesss prevLast = null;
        //11 -> 22 -> 3 -> 422 -> 15 -> NULL
        while(temp!= null) {
            //find the kth node
            Nodesss getKthNode = getKthNode(temp, k);
            //2
            if(getKthNode== null){
                if(prevLast!= null){
                    prevLast.next= temp;//check test understand
                }
                break;
            }

            //store the  start of the next group
            Nodesss nextgroupstart = getKthNode.next;
            // disconnect the current group

            getKthNode.next= null;
            //revserse the group

            Nodesss newheadofgroups = reversesss(temp);

            //connect the revesred group
            if (prevLast != null)
                prevLast.next = newheadofgroups;
            else
                head = newheadofgroups; // for first group

            //Connect last node of this group to next group's start
            temp.next= nextgroupstart;

            //Prepare for next loop
            prevLast = temp;
            temp = nextgroupstart;

        }
        return  head;
    }

    private static Nodesss reversesss(Nodesss temp) {
        Nodesss prev = null;
        Nodesss curr = temp;
        while(curr != null){
            Nodesss nextnodes = curr.next;
            curr.next = prev;
            prev = curr;
            curr= nextnodes;
        }
        return  prev;
    }

    private static Nodesss getKthNode(Nodesss head, int k) {
        k--;
        while(head != null && k>0){
            head = head.next;
            k--;
        }
        return head;
    }

    private static void printlistsss(Nodesss head) {
            Nodesss currnode = head;
            if (head == null) {
                System.out.println("list is empty");
            }
            while (currnode != null) {
                System.out.print(currnode.data + " -> ");
                currnode = currnode.next;
            }
        System.out.print("NULL");
        }
}

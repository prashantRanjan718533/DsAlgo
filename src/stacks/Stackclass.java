package dsalgo.stacks;

public class Stackclass {

    private static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{

        public static Node head = null;
         static boolean isEmpty(){
           
                return head== null;
        }
//push
        public static void push(int data){
            Node newNode = new Node( data );
            if(isEmpty()){
                head = newNode;
            }
             else{
                newNode.next = head;// check
                head = newNode;
             }
        }
//pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        // peek

         public static int peek(){

            if(isEmpty()){
                return -1;
            }
            return head.data;
         }

    }
    public static void main(String[] args) {
        Stack.push(2);
        Stack.push(1);
        Stack.push(3);
   
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
            
        }
    }
}

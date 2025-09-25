package dsalgo.StacksQuestions;

import java.util.EmptyStackException;

public class LinkedStack<E> {
    // Node Structue
    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            next = null;
        }
    }

    private Node<E> head; // top of stack
    private int size; // number of elements

    // O(1) check
    public boolean isEmpty() {
        return head == null;
    }

    // O(1) size
    public int size() {
        return size;
    }

    // push = insert at head
    public void push(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // pop = remove from head
    public E pop() {
        if (isEmpty())
            throw new EmptyStackException();
        E val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // peek = value at head
    public E peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return head.data;
    }

    public static void main(String[] args) {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        linkedStack.push(12);
        linkedStack.push(10);
        linkedStack.push(101);
        linkedStack.push(20);
        linkedStack.push(202);
        linkedStack.push(220);
        linkedStack.push(30);
        // System.out.println(linkedStack.peek());

        System.out.println(linkedStack.pop());
        // System.out.println(linkedStack.peek());
        System.out.println(linkedStack.pop());
        // System.out.println("--2--"+linkedStack.peek());

        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());

        int data = 11;
        pushatnottom(data, linkedStack);

        while (!linkedStack.isEmpty()) {
            System.out.println(linkedStack.pop());
        }

    }

    private static void pushatnottom(int data, LinkedStack<Integer> linkedStack) {
        if(linkedStack.isEmpty()){
            linkedStack.push(data);
            return;
        }        
       
        int top = linkedStack.pop();
        pushatnottom(data, linkedStack);
        linkedStack.push(top);
    }
}

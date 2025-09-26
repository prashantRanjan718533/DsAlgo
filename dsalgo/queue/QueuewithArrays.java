package dsalgo.queue;

public class QueuewithArrays {
    static final int size = 3;
    int arr[] = new int[size];
     int front = 0;
     int rear = 0;
     public void enqueue(int val)
     {
        if(rear==size){
            System.out.println("Queue is full");
        }
        else{
            arr[rear] = val;
            System.out.println("enqued element = "+arr[rear]);
            rear++;
        }
     }
     public void dequeue(){
        if(front==rear){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Dequeued element = "+arr[front]);
            front++;
        }
     }
    

    
    public static void main(String[] args) {
        QueuewithArrays queuewithArrays = new QueuewithArrays();
        // System.out.println("Enqueuing element: "+10);
        queuewithArrays.enqueue(10);
        // System.out.println("Enqueuing element: "+20);
        queuewithArrays.enqueue(20);
        // System.out.println("Enqueuing element: "+32);
        queuewithArrays.enqueue(32);

        System.out.println("queued now deque");
        queuewithArrays.dequeue();
        queuewithArrays.dequeue();

        System.out.println(queuewithArrays.front);
        System.out.println(queuewithArrays.rear);


        
        
    }
}

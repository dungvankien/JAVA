package practiceQueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue=new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(15);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item i: "+queue.dequeue().getKey());
    }
}

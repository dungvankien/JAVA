package queueLinkLoop;

public class Solution {
    public static class Node {
        int data;
        Node link;
    }

    public static class Queue {
        Node front;
        Node rear;
    }

    public static void enQueue(Queue queue, int value) {
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null) {
            queue.front = temp;
        } else {
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link = queue.front;
    }
    public static int deQueue(Queue queue){
        if(queue.front==null){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if(queue.front== queue.rear){
            value=queue.front.data;
            queue.front=null;
            queue.rear=null;
        }else {
            Node temp= queue.front;
            value=temp.data;
            queue.front=queue.front.link;
            queue.rear.link=queue.front;
        }
        return value;
    }
    public static void displayQueue(Queue queue){
        Node temp=queue.front;
        System.out.println("Elements in Circular Queue are: ");
        while (temp.link!=queue.front){
            System.out.printf("%d ",temp.data);
            temp=temp.link;
        }
        System.out.printf("%d ",temp.data);
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.front=queue.rear=null;
        enQueue(queue,14);
        enQueue(queue,22);
        enQueue(queue,6);
        displayQueue(queue);
        System.out.printf("Deleted value=%d ",deQueue(queue));
        System.out.printf("Deleted value = %d ",deQueue(queue));
        displayQueue(queue);
        enQueue(queue,9);
        enQueue(queue,20);
        displayQueue(queue);
    }
}

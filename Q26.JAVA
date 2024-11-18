public class Queue {
    private int maxSize;
    private int front, rear;
    private int[] queue;
    
    public Queue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = rear = -1;
    }
    
    public void enqueue(int value) {
        if (rear < maxSize - 1) {
            if (front == -1) front = 0;
            queue[++rear] = value;
            System.out.println(value + " added to queue.");
        } else {
            System.out.println("Queue Overflow");
        }
    }
    
    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " removed from queue.");
            if (front > rear) front = rear = -1;
        }
    }
    
    public int peek() {
        if (front != -1) {
            return queue[front];
        } else {
            System.out.println("Queue is empty.");
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek());
        queue.dequeue();
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}

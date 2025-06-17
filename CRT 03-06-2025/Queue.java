import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue of integers
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // Remove an element from the queue
        int removed = queue.poll();
        System.out.println("Removed element: " + removed);

        // Peek at the front element without removing it
        int front = queue.peek();
        System.out.println("Front element: " + front);

        System.out.println("Queue after operations: " + queue);
    }
}


import java.util.*;

class Queue {
    private static int front, rear, capacity;
    private static int queue[];

    Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }
    void queueEnqueue(Scanner sc) {

        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        }

        else {
            System.out.println("Enter Value");
            int val = sc.nextInt();
            queue[rear] = val;
            rear++;
        }
        return;
    }
    void queueDequeue() {

        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        }

        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            if (rear < capacity)
                queue[rear] = 0;

            rear--;
        }
        System.out.println("Dequeued!!");
        return;
    }
    void queueDisplay() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }
    static void queueFront() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }
}

public class queueImplement {
    public static void main(String[] args) {
        int choice = 0, size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Queue:\n");
        size = sc.nextInt();
        Queue s = new Queue(size);
        System.out.println("\nQUEUE OPERATION\n");
        while (choice != 4) {
            System.out.println("Chose option...\n");
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.println("\n Enter your choice \n");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {

                    s.queueEnqueue(sc);
                    break;
                }
                case 2: {
                    s.queueDequeue();
                    break;
                }
                case 3: {
                    s.queueDisplay();
                    break;
                }
                case 4: {
                    System.out.println("Exiting!!!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Please Enter valid choice ");
                }
            }
            ;
        }
    }
}

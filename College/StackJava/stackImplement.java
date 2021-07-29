
import java.util.*;
class Stack {
    int top;
    int size = 10;
    int[] arr = new int[size];
    boolean isEmpty() {
        return (top < 0);
    }
    Stack() {
        top = -1;
    }
    boolean push(Scanner sc) {
        if (top == size - 1) {
            System.out.println("Overflow !!");
            return false;
        } else {
            System.out.println("Enter Value");
            int val = sc.nextInt();
            top++;
            arr[top] = val;
            System.out.println("Item pushed");
            return true;
        }
    }
    boolean pop() {
        if (top == -1) {
            System.out.println("Underflow !!");
            return false;
        } else {
            top--;
            System.out.println("Item popped");
            return true;
        }
    }
    void display() {
        System.out.println("Displaying!!!!");
        if (top == -1) {
            System.out.println("Stack Empty !!");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class stackImplement {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("\nSTACK OPERATION\n");
        while (choice != 4) {
            System.out.println("Chose option...\n");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
            System.out.println("\n Enter your choice \n");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
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


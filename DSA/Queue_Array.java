import java.util.Scanner;

public class Queue_Array {
    int max_limit;
    int front, rear;
    int queue[];

    Queue_Array(int n) {
        max_limit = n;
        front = -1;
        rear = -1;
        queue = new int[max_limit];
    }

    void enqueue(int data) {
        if (front == -1) {
            front = 0;
        } else if (rear == max_limit - 1) {
            System.out.println("QUEUE OVERFLOW");
            return;
        }
        queue[++rear] = data;
        System.out.println(data + " has been entered");
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("QUEUE UNDERFLOW");
            return;
        } else if (front == rear) {
            System.out.println(queue[front] + " has been removed");
            front = -1;
            rear = -1;
        } else
            System.out.println(queue[front++] + " has been removed");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Queue");
        int n = sc.nextInt();
        Queue_Array queue_Array = new Queue_Array(n);
        boolean flag = true;

        while (flag) {
            System.out.println("1. Enter Data");
            System.out.println("2. Delete Data");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element to be inserted");
                    int data = sc.nextInt();
                    queue_Array.enqueue(data);
                    break;
                case 2:
                    queue_Array.dequeue();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}

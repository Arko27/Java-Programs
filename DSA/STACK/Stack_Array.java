import java.util.Scanner;

public class Stack_Array {
    int max_limit;
    int top;
    int stack[];

    Stack_Array(int n) {
        max_limit = n;
        top = -1;
        stack = new int[max_limit];
    }

    void push(int data) {
        if (top == max_limit - 1) {
            System.out.println("STACK OVERFLOW");
            return;
        }
        stack[++top] = data;
        System.out.println(data + " has been pushed");

    }

    void pop() {
        if (top == -1) {
            System.out.println("STACK UNDERFLOW");
            return;
        }
        System.out.println(stack[top--] + " has been popped");
    }

    int peek() {
        if (top == -1)
            return -1;
        else
            return stack[top];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Stack");
        int n = sc.nextInt();
        Stack_Array stack_Array = new Stack_Array(n);
        boolean flag = true;

        while (flag) {
            System.out.println("1. Push Data");
            System.out.println("2. Pop Data");
            System.out.println("3. Peek Data");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element to be inserted");
                    int data = sc.nextInt();
                    stack_Array.push(data);
                    break;
                case 2:
                    stack_Array.pop();
                    break;
                case 3:
                    int topEle = stack_Array.peek();
                    if (topEle != -1)
                        System.out.println("The top element is " + topEle);
                    else
                        System.out.println("STACK UNDERFLOW");
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}
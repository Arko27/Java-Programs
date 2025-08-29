package Java;

import java.util.*;

class DoubleNode {
    DoubleNode front;
    DoubleNode rear;
    int data;
}

public class DoubleLinkedList {

    DoubleNode head;
    int count;

    DoubleNode createNode(int value) {
        DoubleNode node = new DoubleNode();
        node.data = value;

        return node;
    }

    void insertNodeAtBegin(DoubleNode node) {
        if (head == null)
            head = node;
        else {
            node.front = head;
            head.rear = node;
            head = node;
        }
    }

    void insertNodeAtEnd(DoubleNode node) {
        DoubleNode temp;
        if (head == null)
            head = node;
        else {
            temp = head;
            while (temp.front != null)
                temp = temp.front;
            temp.front = node;
            node.rear = temp;
        }
    }

    void deleteFromBegin() {
        DoubleNode temp = head;
        if (temp.front == null) {
            head = null;
            System.out.println("The Linked List is Empty");
        } else
            head = temp.front;
            head.rear = null;
    }

    void deleteFromEnd() {
         DoubleNode temp = head;
        DoubleNode temp1 = null;
        if (temp.front == null) {
            head = null;
            System.out.println("The Linked List is Empty");
        } else {
            while (temp.front != null) {
                temp1 = temp;
                temp = temp.front;
            }
            temp1.front = null;
        }
    }

    void displayLinkedList() {
        if (head == null)
            System.out.println("The Linked List is Empty");
        else {
            System.out.println("The Double Linked List is:");
            DoubleNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.front;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList obj = new DoubleLinkedList();
        int value;
        while (true) {
            System.out.println("1. Insert Node at Beginning");
            System.out.println("2. Insert Node at End");
            System.out.println("3. Insert Node by Position");
            System.out.println("4. Delete Node from Beginning");
            System.out.println("5. Delete Node from End");
            System.out.println("6. Delete Node by Value");
            System.out.println("7. Delete Node by Position");
            System.out.println("8. Reverse the Linked List");
            System.out.println("9. Sort the Linked List");
            System.out.println("10. Display nodes");
            System.out.println("11. Exit");
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the value to be inserted: ");
                    value = sc.nextInt();
                    DoubleNode node1 = obj.createNode(value);
                    obj.insertNodeAtBegin(node1);
                    obj.count++;
                    obj.displayLinkedList();
                    break;
                case 2:
                    System.out.println("Enter the value to be inserted: ");
                    value = sc.nextInt();
                    DoubleNode node2 = obj.createNode(value);
                    obj.insertNodeAtEnd(node2);
                    obj.count++;
                    obj.displayLinkedList();
                    break;
                case 3:
                    break;
                case 4:
                    obj.deleteFromBegin();
                    obj.count--;
                    if (obj.head != null)
                        obj.displayLinkedList();
                    break;
                case 5:
                    obj.deleteFromEnd();
                    obj.count--;
                    if (obj.head != null)
                        obj.displayLinkedList();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    obj.displayLinkedList();
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
}
package Java;

import java.util.*;

class Node {
    Node ptr;
    int data;
}

public class CircularLinkedList {

    Node head;

    Node createNode(int value) {
        Node node = new Node();
        node.data = value;

        return node;
    }

    void insertNodeAtBegin(Node node) {
        
    }

    void insertNodeAtEnd(Node node) {
        
    }

    void deleteFromBegin() {
        
    }

    void deleteFromEnd() {
        
    }

    void displayLinkedList() {
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList obj = new CircularLinkedList();
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
                    break;
                case 2:                    
                    break;
                case 3:
                    break;
                case 4:                   
                    break;
                case 5:                    
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
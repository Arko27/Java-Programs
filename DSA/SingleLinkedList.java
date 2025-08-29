package Java;

import java.util.*;

class SingleNode {
    SingleNode ptr;
    int data;
}

public class SingleLinkedList {

    SingleNode head;
    int count;

    SingleNode createNode(int value) {
        SingleNode node = new SingleNode();
        node.data = value;

        return node;
    }

    void displayLinkedList() {
        if (head == null)
            System.out.println("The Linked List is Empty");
        else {
            System.out.println("The Single Linked List is:");
            SingleNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.ptr;
            }
            System.out.println();
        }
    }

    void insertNodeAtBegin(SingleNode node) {
        if (head == null)
            head = node;
        else {
            node.ptr = head;
            head = node;
        }
    }

    void insertNodeAtEnd(SingleNode node) {
        SingleNode temp;
        if (head == null)
            head = node;
        else {
            temp = head;
            while (temp.ptr != null)
                temp = temp.ptr;
            temp.ptr = node;
        }
    }

    void insertAtPosition(SingleNode node, int pos) {
        int i;
        SingleNode temp = head;
        for (i = 1; i < pos - 1; i++)
            temp = temp.ptr;
        node.ptr = temp.ptr;
        temp.ptr = node;
    }

    void deleteFromBegin() {
        SingleNode temp = head;
        if (temp.ptr == null) {
            head = null;
            System.out.println("The Linked List is Empty");
        }

        else
            head = temp.ptr;
    }

    void deleteFromEnd() {
        SingleNode temp = head;
        SingleNode temp1 = null;
        if (temp.ptr == null) {
            head = null;
            System.out.println("The Linked List is Empty");
        } else {
            while (temp.ptr != null) {
                temp1 = temp;
                temp = temp.ptr;
            }
            temp1.ptr = null;
        }
    }

    void deleteByValue(int value) {
        int pos = 1;
        SingleNode temp = head;
        while (temp != null) {
            if (temp.data == value) {
                deleteByPosition(pos);
                return;
            }
            temp = temp.ptr;
            pos++;
        }
        System.out.println(value + " is not present in the Linked List");
    }

    void deleteByPosition(int pos) {
        int i;
        SingleNode temp = head;
        if (pos == 1) {
            count--;
            deleteFromBegin();
        } else if (pos == count) {
            count--;
            deleteFromEnd();
        } else if (pos < 1 || pos > count) {
            System.out.println("Position Invalid");
            return;
        } else {
            for (i = 1; i < pos - 1; i++)
                temp = temp.ptr;
            temp.ptr = temp.ptr.ptr;
            count--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList obj = new SingleLinkedList();
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
                    SingleNode node1 = obj.createNode(value);
                    obj.insertNodeAtBegin(node1);
                    obj.count++;
                    obj.displayLinkedList();
                    break;
                case 2:
                    System.out.println("Enter the value to be inserted: ");
                    value = sc.nextInt();
                    SingleNode node2 = obj.createNode(value);
                    obj.insertNodeAtEnd(node2);
                    obj.count++;
                    obj.displayLinkedList();
                    break;
                case 3:
                    System.out.println("Enter the position and value of the node to be inserted: ");
                    int pos1 = sc.nextInt();
                    value = sc.nextInt();
                    SingleNode node3 = obj.createNode(value);
                    if (pos1 == 1)
                        obj.insertNodeAtBegin(node3);
                    else if (pos1 == obj.count + 1)
                        obj.insertNodeAtEnd(node3);
                    else if (pos1 < 1 || pos1 > obj.count + 1) {
                        System.out.println("Position Invalid");
                        break;
                    } else
                        obj.insertAtPosition(node3, pos1);
                    obj.count++;
                    obj.displayLinkedList();
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
                    System.out.println("Enter the value to be deleted: ");
                    value = sc.nextInt();
                    obj.deleteByValue(value);
                    obj.displayLinkedList();
                    break;
                case 7:
                    System.out.println("Enter the position whose node is to be deleted");
                    int pos2 = sc.nextInt();
                    obj.deleteByPosition(pos2);
                    obj.displayLinkedList();
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
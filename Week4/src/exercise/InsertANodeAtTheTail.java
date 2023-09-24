package exercise;

import edu.princeton.cs.algs4.StdIn;

public class InsertANodeAtTheTail {
    public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head == null) {
            return newNode;
        }

        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

        return head;
    }
    public static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        int n = StdIn.readInt();
        SinglyLinkedListNode head = null;

        for (int i = 0; i < n; i++) {
            int data = StdIn.readInt();
            head = insertNodeAtTail(head, data);
        }
        printLinkedList(head);
    }



}

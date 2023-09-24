package exercise;

public class InsertANodeAtTheHead {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (llist != null) {
            newNode.next = llist;
        }
        llist = newNode;
        return llist;
    }

    public static void main(String[] ar) {

    }
}

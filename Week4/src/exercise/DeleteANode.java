package exercise;

public class DeleteANode {
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {

        if (llist == null || position == 0) {
            return llist != null ? llist.next : null;
        }

        SinglyLinkedListNode current = llist;
        int count = 0;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            return llist;
        }

        current.next = current.next.next;
        return llist;
    }

    public static void main(String[] ar) {

    }
}

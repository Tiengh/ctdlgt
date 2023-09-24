package exercise;

public class MergeTwoSortedLinkedLists {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode dummyHead = new SinglyLinkedListNode(0);
        SinglyLinkedListNode current = dummyHead;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        }
        if (head2 != null) {
            current.next = head2;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {

    }
}

package exercise;

public class ReverseALinkedList {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {

        if(llist == null || llist.next == null) return llist;

        SinglyLinkedListNode prev      = null;
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode nextNode;

        while (current!=null){
            nextNode = current.next;
            current.next  = prev;
            prev = current;
            current = nextNode;
        }
        return llist;

    }
    public static void main(String[] ar){

    }
}

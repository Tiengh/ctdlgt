package exercise;

public class InsertANodeAtASpecificPosition {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if(position == 0){
            newNode.next = llist;
            return newNode;
        }

        int dem = 0;
        SinglyLinkedListNode current = llist;
        while(current!=null && dem < position - 1){
            current = current.next;
            dem++;
        }

        if (current == null) {
            return llist;
        }

        newNode.next = current.next;
        current.next = newNode;
     return llist;
    }
    public static void main(String[] ar){

    }
}

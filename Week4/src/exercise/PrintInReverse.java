package exercise;

public class PrintInReverse {
    public static void reversePrint(SinglyLinkedListNode llist) {
        StringBuilder sb = new StringBuilder();
        if (llist == null) System.out.println("");
        else {
            while (llist != null) {
                sb.insert(0, llist.data);
                llist = llist.next;
            }
            System.out.println(sb.toString());
        }

    }

    public static void main(String[] args) {

    }
}

package exercise;

public class GetNodeValue {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode head = llist;

        int count1 = 0, count2 = 0;
        while(head != null){
            head = head.next;
            count1++;
        }
        while (llist != null){
            llist = llist.next;
            count2++;
            if(count1-count2==positionFromTail){
                return llist.data;
            }
        }
        return 0;

    }

    public static void main(String[] ar){

    }
}

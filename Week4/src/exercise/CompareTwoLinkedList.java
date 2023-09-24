package exercise;

public class CompareTwoLinkedList {
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
       SinglyLinkedListNode test1 = head1;
       SinglyLinkedListNode test2 = head2;

       while(test1!=null || test2!=null){
           if(test1.data != test2.data) return false;
           else{
               test1 = test1.next;
               test2 = test2.next;
           }
           if(test1 == null && test2!=null) return false;
           if(test1 != null && test2==null) return false;
       }
       return true;

    }
    public static void main(String[] ar){

    }
}

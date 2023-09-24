package exercise;

import edu.princeton.cs.algs4.StdIn;

public class printElement {
    public  static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode n = head;
        while (n.next!=null){
            System.out.println(n.data +" ");
            n = n.next;
        }
    }
    public static void main(String[] ar){

    }

}

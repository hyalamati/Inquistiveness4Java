package mypractise.core;
import mypractise.core.MyLinkedList.Node;

public class SinglyLinkedList {

    public static void reverseLinkedList(MyLinkedList linkedList) {
        Node previous = null;
        Node current = linkedList.head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        linkedList.head = previous;
    }
    public static void printLinkedList(MyLinkedList linkedList) {
        Node h = linkedList.head;
        while (linkedList.head != null) {
            System.out.print(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }
        System.out.println();
        linkedList.head = h;
    }

}

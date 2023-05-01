package mypractise.core;

public class MyLinkedList {
    public Node head;

    public class Node {

        public Node next;

        public int data;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}

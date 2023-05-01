package mypractise.core;

public class LinkedList {
    private Node head;
    private Node tail;

//    public LinkedList() {
//        this.head = new Node(1);
//        tail = head;
//    }

    public Node head() {
        return head;
    }

    public void add(Node node) {
        if(head == null && tail == null) {
            this.head = new Node(node.data);
            tail = head;
        }
        tail.next = node;
        tail = node;
    }

    public static class Node {
        private Node next;
        private Integer data;

        public Node(Integer data) {
            this.data = data;
        }

        public Integer data() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    public void findMiddleNode() {
        //finding middle element of LinkedList in single pass
        Node current = head;
        int length = 0;
        Node middle = head;

        while(current.next() != null) {
            length++;
            if(length%2 ==0) {
                middle = middle.next();
            }
            current = current.next();
        }
        System.out.println("middle current after: " + middle.data());
        if(length%2 == 1) {
            middle = middle.next();
        }
        System.out.println("middle after last if: " + middle.data());
        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle.data());
    }
}

package mypractise.core;

public class LinkedListImpl {
    class Node {
        int data;
        Node next;
        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;
    public void insertNode(int data) {
        //insertion happens frm end to beginning
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;

        // direct insertion i.e frm start node
        Node newNode = new Node(data);
        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfterKNode(int k, int value) {
            Node n = new Node(value);
            if(k == head.data) {
                n.next = head.next;
                head.next = n;
                return;
            }
            Node temp = head;
            while(temp.data != k) {
                temp = temp.next;
                if(temp == null){
                    return;
                }
            }
            n.next = temp.next;
            temp.next = n;
    }

    public void deleteAfterKNodeFromEnd(int k) {
        if(k == head.data) {
            head = head.next;
            return;
        }
        int length = getLength(head);
        int nodeFromBeginning = length-k+1;
        Node prev = null;
        Node temp = head;
        for(int i=1; i < nodeFromBeginning; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = prev.next.next;
    }
    static int getLength(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
    return count;
    }
    public void printLinkedList() {
        Node current = head;
        if(current == null) {
            System.out.println("List is Empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data+"->");
            current = current.next;
        }
    }
    public void reverseLinkedList() {
        Node current = head, prev = null, temp = null;
        while(current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
         head = prev;
    }

    //reverse from kth Node
    public Node reverse(Node head, int k) {
        Node prev = null;
        Node curr = head;
        Node next;
        int count = 0;
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (curr != null) {
            head.next = reverse(curr, k);
        }
        return prev;
    }
    public void findMiddle() {
        Node current = head;
        int length = 0;
        Node middle = head;

        while(current != null) {
            length++;
            if(length%2 ==0) {
                middle = middle.next;
            }
            current = current.next;
        }
        if(length%2 == 1) {
            middle = middle.next;
        }
        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle.data);
    }
}

package mypractise.core;
import mypractise.core.MyLinkedList.Node;

public class ReverseLinkedList {

    public static Node reverse(Node node, int k) {
        Node prev = null;
        Node curr = node;
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
            node.next = reverse(curr, k);
        }
        return prev;
    }
}

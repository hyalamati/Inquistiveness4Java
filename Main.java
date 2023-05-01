import mypractise.core.*;
import mypractise.core.LinkedList;
import mypractise.core.queueop.QueStack;
import mypractise.core.LinkedList;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static mypractise.core.ArrayOperations.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Before find");
//        int a[] = {-23, -45, -21, -52, -61, -48};
//        System.out.println("FINDINng SecondHighest: "+ArrayOperations.findSecondHighest(a));
//        System.out.println("FINDINng Highest: "+ArrayOperations.findHighest(a));
//        System.out.println("FINDINng Lowest: "+ArrayOperations.findLowest(a));
//        String url = "https://www.digitalocean.com/community/tutorials/spring-boot-mongodb";
//        CreateUniqueID uniqueID = new CreateUniqueID();
//        System.out.println(uniqueID.shortenURL(url));
//        UUID uuid=UUID.randomUUID();
//        String str = uuid.toString();
//        String x = str.replaceAll("-","");
//        BigInteger big = new BigInteger(x, 16);
//        System.out.println(big);

        //List op
        List l = ListOperations.createList();
        System.out.println(l);

        //Iterating Map conventionally
        Map m= MapOperations.createMap();

        Set set= m.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        //Iterating Map using for each
        Set<Map.Entry<Integer,String>> entrySet = m.entrySet();
        for(Map.Entry entry:entrySet) {
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }

        //sorting Map using Comparator
//        List l1 = new LinkedList(m.entrySet());
//        Collections.sort(l1, new Comparator() {
//            public int compare(Object o1, Object o2) {
//                return ((Comparable) ((Map.Entry) (o1)).getValue())
//                        .compareTo(((Map.Entry) (o2)).getValue());
//            }
//        });
//        System.out.println(l1);

        //Set op
        //SetOperations.insertIntoLinkedHashSet();

        //Array Op
//        Integer arr[] = {3,5,0,8,1,9,6};
//        System.out.println("Finding Kth smallest: "+ArrayOperations.findKthSmallest(arr,4));
//        System.out.println("Finding Kth largest: "+ArrayOperations.findKthLargest(arr,2));
//        //move -ve to left
//        int a[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
//        ArrayOperations.move(a);
//        //dutch national flag
//        int darr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
//        ArrayOperations.rearrange(darr);
//        ArrayOperations.rearrangeDutch(darr);
//        //zero sum
//        int sarr[] = {1, 4, -2, -2, 5, -4, 3};
//
//        // Function cal
//        if (subArrayExists(sarr))
//            System.out.println("Found a subarray with 0 sum");
//        else
//            System.out.println("No Such Sub Array Exists!");

        //finding duplicates in array
//        int num[] = { 4, 2, 4, 5, 2, 3, 5 };
//        ArrayOperations.findDuplicates(num);
//        //ArrayOperations.printRepeating(num, num.length);
//        ArrayOperations.findDupUsngSet(num, num.length);
//        int f = ArrayOperations.firstNonRepeating(num, num.length);
//        System.out.println("first non repeating ele: "+f);
//
//        //msort
//        int marr[] = { 12, 11, 13, 5, 6, 7 };
//
//        System.out.println("Given Array");
//        printArray(marr, marr.length);
//
//        ArrayOperations.mSort(marr, 0, marr.length - 1);
//
//        System.out.println("\nSorted array");
//        printArray(marr, marr.length);
//
//        //binarysearch -- searching a element in a rotated and sorted array
//        int barr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
//        int n = barr.length;
//        int key = 2;
//        int idx = biSearch(barr, 0, n - 1, key);
//        if (idx != -1)
//            System.out.println("\nkey found at Index: " + idx);
//        else
//            System.out.println("Key not found");
//
//        //finding min ele using binary search
//        int barr1[] = { 14, 15, 16, 17, 8, 9, 10, 12, 13 };
//        int min = findMinUsngBiSearch(barr1, 0, n - 1);
//        System.out.println("\nmin element in array is: " + min);
//
//        //Cyclically rotate array by one
//        int carr[] = new int[]{1, 2, 3, 4, 5 };
//        System.out.println("\nAfter rotation: " );
//        rotateCyclically(carr);
//
//        //Cyclically rotate array by one
//        int carr1[] = new int[]{1, 2, 3, 4, 5 };
//        System.out.println("\nAfter rotation: " );
//        rotateCyc(carr1);
//
//        int sarr[] = new int[]{1, 5, 7, -1, 5 };
//        System.out.println("\nPairs with given sum: " + MapOperations.countPairsForSum(sarr, 6));
//
//        // finding common element in arr
//        int ar1[] = { 1, 5, 10, 20, 40, 80 };
//        int ar2[] = { 6, 7, 20, 80, 100 };
//        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
//        System.out.println("\nCommon elements are: " );
//        SetOperations.findCommon(ar1, ar2, ar3);

        //Linked List op
        LinkedListImpl ll = new LinkedListImpl();
        //insertion
        ll.insertNode(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.insertNode(6);
        //print
        ll.printLinkedList();
        //reverse
//        System.out.println("\nreversing Linked List: ");
//        ll.reverseLinkedList();
//        ll.printLinkedList();
//        System.out.println("\nreversing Linked List after k=3");
//        ll.reverse( 3);
//        ll.printLinkedList();
        ll.insertAfterKNode(3, 7);
        ll.printLinkedList();
        ll.deleteAfterKNodeFromEnd(4);
        ll.printLinkedList();
        ll.findMiddle();

        //reverse LL
//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.head = myLinkedList.new Node(1);
//        myLinkedList.head.next = myLinkedList.new Node(2);
//        myLinkedList.head.next.next = myLinkedList.new Node(3);
//        System.out.println("\ncreating Linked List");
//        SinglyLinkedList.printLinkedList(myLinkedList);
//        SinglyLinkedList.reverseLinkedList(myLinkedList);
//        SinglyLinkedList.printLinkedList(myLinkedList);

        //ll -middle

        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add( new LinkedList.Node(1));
        linkedList.add( new LinkedList.Node(2));
        linkedList.add( new LinkedList.Node(3));
        linkedList.add( new LinkedList.Node(4));
        linkedList.add( new LinkedList.Node(5));
        linkedList.add( new LinkedList.Node(6));

        linkedList.findMiddleNode();

        //to check whether a string is anagram
        System.out.println(checkAnagram("word","orde"));
        System.out.println(checkAnagram("mary","army"));

        //producer - consumer - BlockingQueue
        //Creating BlockingQueue of size 10
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        //starting producer to produce messages in queue
        new Thread(producer).start();
        //starting consumer to consume messages from queue
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
    }
}
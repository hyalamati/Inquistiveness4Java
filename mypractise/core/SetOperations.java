package mypractise.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.stream.Stream;

public class SetOperations {
    static HashSet<String> words;
    static LinkedHashSet<String> lwords;
    public static void insertIntoSet(){
        words = new HashSet<>();
        words.add("I too");
        words.add("had a");
        words.add("love");
        words.add("Story");
        words.add("I too");
        Iterator iterator = words.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        words.stream().forEach(S-> System.out.println(S));
    }
    public static void insertIntoLinkedHashSet(){
        lwords = new LinkedHashSet<>();
        lwords.add("I too");
        lwords.add("had a");
        lwords.add("love");
        lwords.add("Story");
        lwords.add("I too");
        System.out.println("Iterating in a Conventional Way ");
        Iterator iterator = lwords.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Iterating Using Streams ");
        lwords.stream().forEach(S-> System.out.println(S));

//        Stream.of(lwords).sorted((Object o1, Object o2)
//                        -> o1.compareTo(o2))
//                .         forEach(System.out::println);
    }

    //finding common elements in 3 arrays
    public static void findCommon(int a[], int b[], int c[]) {
        int i;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for(i = 0; i < a.length; i++)
            set1.add(a[i]);
        for(i = 0; i < b.length; i++)
            set2.add(b[i]);
        for(i = 0; i < c.length; i++) {
            if(set1.contains(c[i]) && set2.contains(c[i])) {
                if(set3.contains(c[i]) == false)
                    System.out.print(c[i]+" ");
                set3.add(c[i]);
            }
        }
        set3.stream().forEach(C -> System.out.println(C));
    }

}

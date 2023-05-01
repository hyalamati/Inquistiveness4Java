package mypractise.core;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListOperations {
    public static List createList()
    {
        List<String> list = new LinkedList<>();
        List<String> newList = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        Collections.reverse(list);
        for(int i=0; i<list.size();i++){
            newList.add(list.get(i));
        }
        return newList;
    }
}

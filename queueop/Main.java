import mypractise.core.*;
import mypractise.core.queueop.QueStack;

import java.util.*;

import static mypractise.core.ArrayOperations.*;

public class Main {
    public static void main(String[] args) {
        //queue -- using stack -- Driver code
        QueStack queStack = new QueStack();
        QueStack.Q q = new QueStack.Q();
        q.s1 = new Stack<Integer>();
        q.s2 = new Stack<Integer>();
        queStack.enque(q, 3);
        queStack.enque(q, 4);
        queStack.enque(q, 5);
        queStack.enque(q, 6);

        System.out.println("after pop frm Q: \n"+queStack.deque(q) +" ");
        System.out.println(queStack.deque(q) +" ");
        System.out.println(queStack.deque(q) +" ");
    }
}
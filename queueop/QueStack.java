package mypractise.core.queueop;

import java.util.Stack;

// Implementing queue using two stacks
public class QueStack {
    public static class Q{
        public Stack<Integer> s1;
        public Stack<Integer> s2;
    }
    public void enque(Q q, int ele) {
        while(!q.s1.isEmpty()){
            q.s2.push(q.s1.pop());
        }
        q.s1.push(ele);
        while(!q.s2.isEmpty()){
            q.s1.push(q.s2.pop());
        }
    }
    public int deque(Q q) {
        if(q.s1.isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        int top = q.s1.peek();
        q.s1.pop();
        return top;
    }
}

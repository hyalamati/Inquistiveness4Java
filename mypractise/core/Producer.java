package mypractise.core;

import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    /*
    Java BlockingQueue doesn’t accept null values and throw NullPointerException if you try to store null value in the queue.
    Java BlockingQueue implementations are thread-safe. All queuing methods are atomic in nature and use internal locks or other forms of concurrency control.
    Java BlockingQueue interface is part of java collections framework and it’s primarily used for implementing producer consumer problem. We don’t need to worry
    about waiting for the space to be available for producer or object to be available for consumer in BlockingQueue because it’s handled by implementation classes of BlockingQueue.
    Java provides several BlockingQueue implementations such as ArrayBlockingQueue, LinkedBlockingQueue, PriorityBlockingQueue, SynchronousQueue etc. While implementing producer consumer problem in BlockingQueue, we will use ArrayBlockingQueue implementation. Following are some important methods you should know.

put(E e): This method is used to insert elements to the queue. If the queue is full, it waits for the space to be available.
E take(): This method retrieves and remove the element from the head of the queue. If queue is empty it waits for the element to be available.

     */
    private BlockingQueue<Message> queue;
    public Producer(BlockingQueue<Message> q) {
        this.queue = q;
    }
    @Override
    public void run() {
        //produce msgs
        for(int i=0; i<100; i++) {
            Message msg = new Message(""+i);
            try{
                Thread.sleep(i);
                queue.put(msg);
                System.out.println("Produced: "+msg.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //exit msg
        Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package org.example.QueueAndDeque;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueClass {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue=new PriorityQueue<String>();
        priorityQueue.add("Ashlesha");
        priorityQueue.add("Ram");
        priorityQueue.add("hari");


        Iterator iterator =priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        priorityQueue.remove();

        for (String string : priorityQueue
                ) {
            System.out.println(string);
        }
    }
}

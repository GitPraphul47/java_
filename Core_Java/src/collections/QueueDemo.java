package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        queue.add(12);
        queue.add(10);
        queue.add(18);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);
    }
}

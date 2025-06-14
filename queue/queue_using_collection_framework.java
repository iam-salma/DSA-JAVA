package queue;

import java.util.*;

public class queue_using_collection_framework {
    public static void main(String[] args) {
        // Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>(); // double ended queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove()+" removed");
        q.add(6);
        System.out.println(q.remove()+" removed");
        q.add(7);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}

package linkedlist;

import java.util.LinkedList;

public class LLClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("is");
        list.addFirst("this");
        list.addLast("linkedlist");
        list.add(2, "a");
        System.out.println(list);
    }
}

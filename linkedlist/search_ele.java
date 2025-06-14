package linkedlist;

import java.util.LinkedList;

public class search_ele {
    public static void main(String[] args) {
        int i,flag=0;
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("5");
        list.add("7");
        list.add("3");
        list.add("8");
        list.add("2");
        list.add("3");
        for(i=0;i < list.size();i++){
            if(list.get(i).compareTo("7") == 0){
                System.out.println("element found at index "+i);
                flag = 1;
            }
        }
        if(flag == 0)
            System.out.println("element not found");
    }
}

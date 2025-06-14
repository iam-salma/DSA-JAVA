package stack;

import java.util.ArrayList;

public class stack_arraylist {
    static ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public void push(int data){
        list.add(data);
    }

    public int pop(){
        if(isEmpty()) return -1;
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public void peek(){
        if(isEmpty()) System.out.println("stack underflow!");
        System.out.println(list.get(list.size() - 1));
    }

    public void display(){
        if(isEmpty()) System.out.println("stack underflow!");
        for(int i = list.size() - 1;  i >= 0 ; i--){
            System.out.print(list.get(i)+ "\t");
        }
        System.out.println();
    }

    public static void main(String args[]){
            stack_arraylist s = new stack_arraylist();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.display();
            s.peek();
            s.pop();
            s.display();
        }
}

package stack;

import java.util.Stack;

public class stack_rev {

    public static void pushAtBottom(int data, Stack <Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        // s.addFirst(data);    or

        int top = s.pop();
        pushAtBottom(data, s);  //recursively
        s.push(top);
    }

    public static void reverse(Stack <Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top , s);
    }

    public static void main(String[] args) {
        Stack <Integer> s = new Stack <>();
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottom(1,s);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

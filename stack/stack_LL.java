package stack;

public class stack_LL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class stack{
        public static Node head;

        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop(){
            if(head == null) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        public void peek(){
            if(head == null) return;
            System.out.println(head.data);
        }

        public void display(){
            if(head == null) System.out.println("stack underflow!");
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + "\t");
                curr = curr.next;
            }
            System.out.println();
        }
        
        public static void main(String args[]){
            stack s = new stack();
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
}

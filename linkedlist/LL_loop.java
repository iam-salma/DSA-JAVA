package linkedlist;

public class LL_loop {
    Node head;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            next = null;
        }
    }

    public void add(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void printlist(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public boolean hasloop(){
        if(head == null || head.next == null)
            return false;
        Node fast = head;
        Node slow = head;
        slow = slow.next;
        fast = fast.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                slow = head;
                if(slow == fast){
                    while(fast.next != slow)
                        fast = fast.next;
                }else{
                    while(slow.next != fast.next){
                        slow = slow.next;
                        fast = fast.next;
                    }
                }
                fast.next = null;
                return true;
            }
        }
        return false;
    }

    public void generateloop(){
        if(head == null)
            return;
        Node curr = head;
        Node loopstart = head;
        while(curr.next != null && curr.next.next != null){
            curr = curr.next.next;
            loopstart = loopstart.next;
        }
        curr.next = loopstart;
    }

    public static void main(String args[]){
        LL_loop list = new LL_loop();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.printlist();

        list.generateloop();
        // list.printlist();

        if(list.hasloop())
            System.out.println("it had a loop!");
        else
            System.out.println(" it does not have a loop!");
        list.printlist();
    }
}

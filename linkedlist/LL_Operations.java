package linkedlist;

public class LL_Operations {
    Node head;
    int size= 0;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size ++;
    }

    public void addlast(String data){
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
        size ++;
    }

    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public void getsize(){
        System.out.println(size);
    }

    public void removefirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        size --;
    }

    public void removelast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size --;
        Node curr = head;
        Node nextcurr = curr.next;
        if(nextcurr == null){
            head = null;
            return;
        }

        while(nextcurr.next != null){
            nextcurr = nextcurr.next;
        }
        nextcurr = null;
        curr.next = nextcurr;
    }

    public void addinbtw(String data, int idx){
        Node newNode = new Node(data);
        int ptr= 0;
        if(head == null || idx == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curr = head;
        while(ptr != idx){
            curr = curr.next;
            ptr ++;
        }
        Node temp = curr.next;
        curr.next = newNode;
        newNode.next = temp;
        size ++;
    }

    public void reverseiterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode= head;
        Node currNode= prevNode.next;
        while(currNode != null){
            Node nextNode= currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead= reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public Node swapPairsIterative(Node head){
        Node dummy = new Node("");
        dummy.next = head;
        Node currNode = dummy;
        while(currNode.next != null && currNode.next.next != null){
            Node firstNode = currNode.next;
            Node secondNode = currNode.next.next;
            firstNode.next = secondNode.next;
            currNode.next = secondNode;
            currNode.next.next = firstNode;
            currNode = currNode.next.next;
        }
        return dummy.next;
    }

    public Node swapPairs(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node pair = head.next;
        head.next = swapPairs(head.next.next);
        pair.next = head;
        return pair;
    }

    public Node removeNthnodefromend(Node head,int n){
        if(head == null || head.next == null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            return head.next;
        }
        int indexofprev = size-n ;
        int i = 1;
        Node prev = head;
        while(i != indexofprev){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        LL_Operations list =new LL_Operations();

        list.addfirst("a");
        list.addfirst("25");
        list.addlast("33");
        list.printlist();

        list.removefirst();
        list.printlist();

        list.removelast();
        list.printlist();

        list.addfirst("b");
        list.addlast("c");
        list.addinbtw("66",1);
        list.printlist();

        list.getsize();

        list.reverseiterate();
        list.printlist();

        list.head = list.reverseRecursive(list.head);
        list.printlist();
        
        list.head = list.swapPairsIterative(list.head);
        list.printlist();

        list.head = list.removeNthnodefromend(list.head, 2);
        list.printlist();
    }
}

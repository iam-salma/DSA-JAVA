package linkedlist;

public class LL_palindrome {
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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

    Node findmid(Node head){
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node reverselist(Node head){
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        return prev;
    }

    boolean ispalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node mid = findmid(head);
        Node rev = reverselist(mid.next);
        Node main = head;
        while( rev != null){
            if(main.data.compareTo(rev.data) != 0){
                return false;
            }
            main = main.next;
            rev = rev.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LL_palindrome list =new LL_palindrome();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("2");
        list.add("1");
        list.printlist();

        if(list.ispalindrome()){
            System.out.println("the list is a palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }
        
    }
}

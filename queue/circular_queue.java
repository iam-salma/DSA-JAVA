package queue;

public class circular_queue {
    static class Queue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear+1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full!");
                return;
            }
            if (front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
            System.out.println(data+" added");
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int result = arr[front];
            if (rear == front){
                rear = front = -1;
            } else {
                front = (front+1) % size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);  // Provide size
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

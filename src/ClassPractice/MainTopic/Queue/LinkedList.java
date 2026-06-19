package ClassPractice.MainTopic.Queue;

public class LinkedList {
    Node front;
    Node rear;
    int size;
    LinkedList(){
        this.front = null;
        this.rear = null;
       this.size = 0;
    }
    public boolean isEmpty(){
        return (this.front == null);
    }
    public int getSize(){
        return  this.size;
    }
    public int getFront(){
        if(this.front == null)
        {
            System.out.println("Queue is empty!!");
            return Integer.MAX_VALUE;
        }
        return this.front.data;
    }
    public int getRear(){
        if(this.rear == null)
        {
            System.out.println("Queue is empty!!");
            return Integer.MAX_VALUE;
        }
        return this.rear.data;
    }
    public void enqueue(int v){
        Node temp = new Node(v);
        if(this.front == null)
        {
            this.rear = temp;
            this.front = temp;
            this.size++;
        }
        else {
            this.rear.next = temp;
            this.rear = temp;
            this.size++;
        }
    }
    public void dequeue(){
        if(this.front == null)
        {
            System.out.println("Queue is empty!!");
            return;
        } else if (this.getSize() == 1) {
            this.front = null;
            this.rear = null;
        }
        else {
            this.front = this.front.next;
        }
        size--;
    }
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        obj.enqueue(20);
        obj.enqueue(10);
        obj.enqueue(30);
        obj.enqueue(10);
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        System.out.println(obj.getRear());
        System.out.println(obj.getFront());
        System.out.println(obj.isEmpty());
        System.out.println(obj.getSize());
        Node.traverse(obj.front);
    }
}

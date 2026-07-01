package ClassPractice.MainTopic.Deque;


import ClassPractice.MainTopic.DoublyLinkedList.Node;

public class DoublyLinkedList {
    Node front;
    Node rear;
    int size;
    Node head;
    DoublyLinkedList(){
        this.front = null;
        this.rear = null;
        this.head = null;
        this.size = 0;
    }

    // INSERT Front
    public void insertFront(int data){
        Node temp = new Node(data);
        if (this.head == null)
        {
            this.rear = temp;
        }
        else {
            temp.next = head;
            head.prev = temp;
        }
        this.head = temp;
        this.front = temp;
        this.size++;
    }

    //Insert Rear
    public void insertRear(int data){
        Node temp = new Node(data);
        if (head == null)
        {
            this.head = temp;
            this.front = temp;
        }
        else {
            this.rear.next = temp;
            temp.prev = this.rear;
        }
        this.rear = temp;
        this.size++;
    }

    //Remove Front
    public void removeFront(){
        if(this.head == null)
        {
            System.out.println("Dequeue is empty!!");
            return;
        }
        else if(this.size == 1)
        {
            this.head = null;
            this.rear = null;
            this.front = null;
        }
        else {
            this.front = this.front.next;
            this.front.prev = null;
            this.head = this.front;
        }
        this.size--;
    }


    //Remove rear
    public void removeRear(){
        if(this.size == 0)
        {
            System.out.println("Dequeue is null!!");
            return;
        }
        else if(this.size == 1)
        {
            this.head = null;
            this.rear = null;
            this.front = null;
        }
        else {

            this.rear = this.rear.prev;
            this.rear.next = null;
        }
        this.size--;
    }

    //get size
    public int getSize(){
        return this.size;
    }


    //get front
    public int getFront(){
        if(this.getSize() == 0)
        {
            System.out.println("No values in dequeue");
            return -1;
        }
        return this.front.data;
    }

    //get Rear
    public int getRear(){
        if(this.getSize() == 0)
        {
            System.out.println("No values in dequeue");
            return -1;
        }
       return this.rear.data;
    }


    public void printDequeue(){
        if(this.head == null)
        {
            System.out.println("Queue is empty!!");
        }
        Node curr = this.head;
        while (curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
   public static void main(String []args) {
        DoublyLinkedList sc = new DoublyLinkedList();
        sc.removeFront();
        sc.insertFront(10);
        sc.insertFront(20);
        sc.insertRear(30);
        sc.removeFront();
        sc.insertRear(40);
        sc.removeFront();
        sc.removeRear();
       System.out.println(sc.getRear());
        System.out.println(sc.getSize());
        sc.printDequeue();
       System.out.println();
       System.out.println(sc.getFront());
       System.out.println(sc.getRear());
    }
}
